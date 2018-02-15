package com.project.quiz.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.quiz.app.dto.SubjectDto;
import com.project.quiz.app.exception.MissingParametersException;
import com.project.quiz.app.exception.SubjectAlreadyExistsException;
import com.project.quiz.app.exception.SubjectNotFoundException;
import com.project.quiz.app.facade.SubjectFacade;
import com.project.quiz.app.utils.LogMessage;

import lombok.extern.log4j.Log4j;

@Log4j
@RestController
@RequestMapping("/subject/quiz/api")
public class SubjectController {

	@Autowired
	private SubjectFacade subjectFacade;
	
	@PostMapping("/")
	public ResponseEntity<?> addSubject(SubjectDto SubjectDto) {
		
		log.trace(LogMessage.hitController);
		//TODO
		log.trace(LogMessage.exitController);
		return ResponseEntity.ok(null);
	}
	
	@GetMapping("/")
	public ResponseEntity<?> getSubject(long id) {
		
		log.trace(LogMessage.hitController);
		//TODO
		log.trace(LogMessage.exitController);
		return ResponseEntity.ok(null);
	}

	@PutMapping("/")
	public ResponseEntity<?> updateSubject(SubjectDto SubjectDto) {
		
		log.trace(LogMessage.hitController);
		//TODO
		log.trace(LogMessage.exitController);
		return ResponseEntity.ok(null);
	}

	@DeleteMapping("/")
	public void deleteSubject(long id) {
		
		log.trace(LogMessage.hitController);
		//TODO
		log.trace(LogMessage.exitController);
	}

	@GetMapping("/")
	public ResponseEntity<?> getAllSubjects() {
		
		log.trace(LogMessage.hitController);
		//TODO
		log.trace(LogMessage.exitController);
		return ResponseEntity.ok(null);
	}
}
