package com.project.quiz.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.quiz.app.dto.ErrorDto;
import com.project.quiz.app.dto.SubjectDto;
import com.project.quiz.app.dto.SuccessDto;
import com.project.quiz.app.exception.MissingParametersException;
import com.project.quiz.app.exception.SubjectAlreadyExistsException;
import com.project.quiz.app.exception.SubjectNotFoundException;
import com.project.quiz.app.facade.SubjectFacade;
import com.project.quiz.app.utils.LogMessage;

import lombok.extern.log4j.Log4j;

@Log4j
@RestController
@RequestMapping("/quiz/api")
public class SubjectController {

	@Autowired
	private SubjectFacade SubjectFacade;

	@PostMapping("/subject")
	public ResponseEntity<?> addSubject(@RequestBody(required = true) SubjectDto SubjectDto) {

		log.trace(LogMessage.hitController);

		SubjectDto responseDto = null;
		try {
			responseDto = SubjectFacade.addSubject(SubjectDto);
		} catch (SubjectAlreadyExistsException e) {
			ResponseEntity.status(409).body(new ErrorDto(e.getMessage()));
		} catch (MissingParametersException e) {
			ResponseEntity.status(404).body(new ErrorDto(e.getMessage()));
		}

		log.trace(LogMessage.exitController);
		return ResponseEntity.ok(responseDto);
	}

	@GetMapping("/subject")
	public ResponseEntity<?> getSubject(@RequestParam(value = "subjectId", required = true) long id) {

		log.trace(LogMessage.hitController);
		
		SubjectDto responseDto = null;
		
		try {
			responseDto = SubjectFacade.getSubject(id);
		} catch (SubjectNotFoundException e) {
			ResponseEntity.status(404).body(new ErrorDto(e.getMessage()));
		}
		
		log.trace(LogMessage.exitController);
		return ResponseEntity.ok(responseDto);
	}

	@PutMapping("/subject")
	public ResponseEntity<?> updateSubject(@RequestBody(required = true) SubjectDto SubjectDto) {

		log.trace(LogMessage.hitController);
		
		SubjectDto responseDto = null;
		
		try {
			responseDto = SubjectFacade.updateSubject(SubjectDto);
		} catch (SubjectNotFoundException e) {
			ResponseEntity.status(404).body(new ErrorDto(e.getMessage()));
		} catch (MissingParametersException e) {
			ResponseEntity.status(404).body(new ErrorDto(e.getMessage()));
		}
		
		log.trace(LogMessage.exitController);
		return ResponseEntity.ok(responseDto);
	}

	@DeleteMapping("/subject")
	public ResponseEntity<?> deleteSubject(@RequestParam(value = "subjectId", required = true) long id) {

		log.trace(LogMessage.hitController);
		
		try {
			SubjectFacade.deleteSubject(id);
		} catch (SubjectNotFoundException e) {
			return ResponseEntity.status(404).body(new ErrorDto(e.getMessage()));
		}
		
		log.trace(LogMessage.exitController);
		return ResponseEntity.status(HttpStatus.OK).body(new SuccessDto().getMessage());
	}

	@GetMapping("/subject/all")
	public ResponseEntity<?> getAllSubjects() {

		log.trace(LogMessage.hitController);
		
		List<SubjectDto> responseDtos = null;
		try {
			responseDtos = SubjectFacade.getAllSubjects();
		} catch (SubjectNotFoundException e) {
			ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorDto(e.getMessage()));
		}
		
		log.trace(LogMessage.exitController);
		return ResponseEntity.ok(responseDtos);
	}
}
