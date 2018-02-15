package com.project.quiz.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.quiz.app.dto.QuestionDto;
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
	private QuestionFacade questionFacade;

	@PostMapping("/")
	public ResponseEntity<?> addQuestion(QuestionDto QuestionDto) {
		
		log.trace(LogMessage.hitController);
		//TODO
		log.trace(LogMessage.exitController);
		return ResponseEntity.ok(null);
	}
	
	@GetMapping("/")
	public ResponseEntity<?> getQuestion(long id) {
		
		log.trace(LogMessage.hitController);
		//TODO
		log.trace(LogMessage.exitController);
		return ResponseEntity.ok(null);
	}

	@PutMapping("/")
	public ResponseEntity<?> updateQuestion(QuestionDto QuestionDto) {
		
		log.trace(LogMessage.hitController);
		//TODO
		log.trace(LogMessage.exitController);
		return ResponseEntity.ok(null);
	}

	@DeleteMapping("/")
	public void deleteQuestion(long id) {
		
		log.trace(LogMessage.hitController);
		//TODO
		log.trace(LogMessage.exitController);
	}

	@GetMapping("/")
	public ResponseEntity<?> getAllQuestions() {
		
		log.trace(LogMessage.hitController);
		//TODO
		log.trace(LogMessage.exitController);
		return ResponseEntity.ok(null);
	}	
}
