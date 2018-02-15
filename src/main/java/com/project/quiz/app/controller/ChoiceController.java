package com.project.quiz.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.quiz.app.dto.ChoiceDto;
import com.project.quiz.app.dto.ErrorDto;
import com.project.quiz.app.dto.SuccessDto;
import com.project.quiz.app.exception.ChoiceAlreadyExistsException;
import com.project.quiz.app.exception.ChoiceNotFoundException;
import com.project.quiz.app.exception.MissingParametersException;
import com.project.quiz.app.facade.ChoiceFacade;
import com.project.quiz.app.utils.LogMessage;

import lombok.extern.log4j.Log4j;

@Log4j
@RestController
public class ChoiceController {

	@Autowired
	private ChoiceFacade choiceFacade;

	@PostMapping("/")
	public ResponseEntity<?> addChoice(ChoiceDto choiceDto) {

		log.trace(LogMessage.hitController);

		ChoiceDto responseDto = null;
		try {
			responseDto = choiceFacade.addChoice(choiceDto);
		} catch (ChoiceAlreadyExistsException e) {
			ResponseEntity.status(409).body(new ErrorDto(e.getMessage()));
		} catch (MissingParametersException e) {
			ResponseEntity.status(404).body(new ErrorDto(e.getMessage()));
		}

		log.trace(LogMessage.exitController);
		return ResponseEntity.ok(responseDto);
	}

	@GetMapping("/")
	public ResponseEntity<?> getChoice(long id) {

		log.trace(LogMessage.hitController);
		
		ChoiceDto responseDto = null;
		
		try {
			responseDto = choiceFacade.getChoice(id);
		} catch (ChoiceNotFoundException e) {
			ResponseEntity.status(404).body(new ErrorDto(e.getMessage()));
		}
		
		log.trace(LogMessage.exitController);
		return ResponseEntity.ok(responseDto);
	}

	@PutMapping("/")
	public ResponseEntity<?> updateChoice(ChoiceDto choiceDto) {

		log.trace(LogMessage.hitController);
		
		ChoiceDto responseDto = null;
		
		try {
			responseDto = choiceFacade.updateChoice(choiceDto);
		} catch (ChoiceNotFoundException e) {
			ResponseEntity.status(404).body(new ErrorDto(e.getMessage()));
		} catch (MissingParametersException e) {
			ResponseEntity.status(404).body(new ErrorDto(e.getMessage()));
		}
		
		log.trace(LogMessage.exitController);
		return ResponseEntity.ok(responseDto);
	}

	@DeleteMapping("/")
	public ResponseEntity<?> deleteChoice(long id) {

		log.trace(LogMessage.hitController);
		
		try {
			choiceFacade.deleteChoice(id);
		} catch (ChoiceNotFoundException e) {
			return ResponseEntity.status(404).body(new ErrorDto(e.getMessage()));
		}
		
		log.trace(LogMessage.exitController);
		return ResponseEntity.status(HttpStatus.OK).body(new SuccessDto().getMessage());
	}

	@GetMapping("/")
	public ResponseEntity<?> getAllChoices() {

		log.trace(LogMessage.hitController);
		// TODO
		log.trace(LogMessage.exitController);
		return ResponseEntity.ok(null);
	}
}
