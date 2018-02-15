package com.project.quiz.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.quiz.app.dto.TopicDto;
import com.project.quiz.app.exception.MissingParametersException;
import com.project.quiz.app.exception.TopicAlreadyExistsException;
import com.project.quiz.app.exception.TopicNotFoundException;
import com.project.quiz.app.facade.TopicFacade;
import com.project.quiz.app.utils.LogMessage;

import lombok.extern.log4j.Log4j;

@Log4j
@RestController
public class TopicController {
	
	
	@Autowired
	private TopicFacade topicFacade;

	@PostMapping("/")
	public ResponseEntity<?> addTopic(TopicDto TopicDto) {
		
		log.trace(LogMessage.hitController);
		//TODO
		log.trace(LogMessage.exitController);
		return ResponseEntity.ok(null);
	}
	
	@GetMapping("/")
	public ResponseEntity<?> getTopic(long id) {
		
		log.trace(LogMessage.hitController);
		//TODO
		log.trace(LogMessage.exitController);
		return ResponseEntity.ok(null);
	}

	@PutMapping("/")
	public ResponseEntity<?> updateTopic(TopicDto TopicDto) {
		
		log.trace(LogMessage.hitController);
		//TODO
		log.trace(LogMessage.exitController);
		return ResponseEntity.ok(null);
	}

	@DeleteMapping("/")
	public void deleteTopic(long id) {
		
		log.trace(LogMessage.hitController);
		//TODO
		log.trace(LogMessage.exitController);
	}

	@GetMapping("/")
	public ResponseEntity<?> getAllTopics() {
		
		log.trace(LogMessage.hitController);
		//TODO
		log.trace(LogMessage.exitController);
		return ResponseEntity.ok(null);
	}
}
