package com.project.quiz.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.quiz.app.dto.ErrorDto;
import com.project.quiz.app.dto.QuestionDto;
import com.project.quiz.app.dto.SuccessDto;
import com.project.quiz.app.exception.QuestionAlreadyExistsException;
import com.project.quiz.app.exception.QuestionNotFoundException;
import com.project.quiz.app.facade.QuestionFacade;
import com.project.quiz.app.utils.LogMessage;
import com.project.quiz.app.exception.MissingParametersException;

import lombok.extern.log4j.Log4j;

@Log4j
@RestController
public class QuestionController {
	
	@Autowired
	private QuestionFacade QuestionFacade;

	@PostMapping("/")
	public ResponseEntity<?> addQuestion(QuestionDto QuestionDto) {

		log.trace(LogMessage.hitController);

		QuestionDto responseDto = null;
		try {
			responseDto = QuestionFacade.addQuestion(QuestionDto);
		} catch (QuestionAlreadyExistsException e) {
			ResponseEntity.status(409).body(new ErrorDto(e.getMessage()));
		} catch (MissingParametersException e) {
			ResponseEntity.status(404).body(new ErrorDto(e.getMessage()));
		}

		log.trace(LogMessage.exitController);
		return ResponseEntity.ok(responseDto);
	}

	@GetMapping("/")
	public ResponseEntity<?> getQuestion(long id) {

		log.trace(LogMessage.hitController);
		
		QuestionDto responseDto = null;
		
		try {
			responseDto = QuestionFacade.getQuestion(id);
		} catch (QuestionNotFoundException e) {
			ResponseEntity.status(404).body(new ErrorDto(e.getMessage()));
		}
		
		log.trace(LogMessage.exitController);
		return ResponseEntity.ok(responseDto);
	}

	@PutMapping("/")
	public ResponseEntity<?> updateQuestion(QuestionDto QuestionDto) {

		log.trace(LogMessage.hitController);
		
		QuestionDto responseDto = null;
		
		try {
			responseDto = QuestionFacade.updateQuestion(QuestionDto);
		} catch (QuestionNotFoundException e) {
			ResponseEntity.status(404).body(new ErrorDto(e.getMessage()));
		} catch (MissingParametersException e) {
			ResponseEntity.status(404).body(new ErrorDto(e.getMessage()));
		}
		
		log.trace(LogMessage.exitController);
		return ResponseEntity.ok(responseDto);
	}

	@DeleteMapping("/")
	public ResponseEntity<?> deleteQuestion(long id) {

		log.trace(LogMessage.hitController);
		
		try {
			QuestionFacade.deleteQuestion(id);
		} catch (QuestionNotFoundException e) {
			return ResponseEntity.status(404).body(new ErrorDto(e.getMessage()));
		}
		
		log.trace(LogMessage.exitController);
		return ResponseEntity.status(HttpStatus.OK).body(new SuccessDto().getMessage());
	}

	@GetMapping("/")
	public ResponseEntity<?> getAllQuestions() {

		log.trace(LogMessage.hitController);
		
		List<QuestionDto> responseDtos = null;
		try {
			responseDtos = QuestionFacade.getAllQuestions();
		} catch (QuestionNotFoundException e) {
			ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorDto(e.getMessage()));
		}
		
		log.trace(LogMessage.exitController);
		return ResponseEntity.ok(responseDtos);
	}
}
