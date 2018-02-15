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
import com.project.quiz.app.dto.SuccessDto;
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
	private TopicFacade TopicFacade;

	@PostMapping("/")
	public ResponseEntity<?> addTopic(TopicDto TopicDto) {

		log.trace(LogMessage.hitController);

		TopicDto responseDto = null;
		try {
			responseDto = TopicFacade.addTopic(TopicDto);
		} catch (TopicAlreadyExistsException e) {
			ResponseEntity.status(409).body(new ErrorDto(e.getMessage()));
		} catch (MissingParametersException e) {
			ResponseEntity.status(404).body(new ErrorDto(e.getMessage()));
		}

		log.trace(LogMessage.exitController);
		return ResponseEntity.ok(responseDto);
	}

	@GetMapping("/")
	public ResponseEntity<?> getTopic(long id) {

		log.trace(LogMessage.hitController);
		
		TopicDto responseDto = null;
		
		try {
			responseDto = TopicFacade.getTopic(id);
		} catch (TopicNotFoundException e) {
			ResponseEntity.status(404).body(new ErrorDto(e.getMessage()));
		}
		
		log.trace(LogMessage.exitController);
		return ResponseEntity.ok(responseDto);
	}

	@PutMapping("/")
	public ResponseEntity<?> updateTopic(TopicDto TopicDto) {

		log.trace(LogMessage.hitController);
		
		TopicDto responseDto = null;
		
		try {
			responseDto = TopicFacade.updateTopic(TopicDto);
		} catch (TopicNotFoundException e) {
			ResponseEntity.status(404).body(new ErrorDto(e.getMessage()));
		} catch (MissingParametersException e) {
			ResponseEntity.status(404).body(new ErrorDto(e.getMessage()));
		}
		
		log.trace(LogMessage.exitController);
		return ResponseEntity.ok(responseDto);
	}

	@DeleteMapping("/")
	public ResponseEntity<?> deleteTopic(long id) {

		log.trace(LogMessage.hitController);
		
		try {
			TopicFacade.deleteTopic(id);
		} catch (TopicNotFoundException e) {
			return ResponseEntity.status(404).body(new ErrorDto(e.getMessage()));
		}
		
		log.trace(LogMessage.exitController);
		return ResponseEntity.status(HttpStatus.OK).body(new SuccessDto().getMessage());
	}

	@GetMapping("/")
	public ResponseEntity<?> getAllTopics() {

		log.trace(LogMessage.hitController);
		
		List<TopicDto> responseDtos = null;
		try {
			responseDtos = TopicFacade.getAllTopics();
		} catch (TopicNotFoundException e) {
			ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorDto(e.getMessage()));
		}
		
		log.trace(LogMessage.exitController);
		return ResponseEntity.ok(responseDtos);
	}
}
