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
@RequestMapping("/quiz/api")
public class ChoiceController {

	@Autowired
	private ChoiceFacade choiceFacade;

	@PostMapping("/choice")
	public ResponseEntity<?> addChoice(@RequestBody(required = true)ChoiceDto choiceDto) {

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

	@GetMapping("/choice")
	public ResponseEntity<?> getChoice(@RequestParam(value = "choiceId", required = true) long id) {

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

	@PutMapping("/choice")
	public ResponseEntity<?> updateChoice(@RequestBody(required = true) ChoiceDto choiceDto) {

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

	@DeleteMapping("/choice")
	public ResponseEntity<?> deleteChoice(@RequestParam(value = "choiceId", required = true) long id) {

		log.trace(LogMessage.hitController);
		
		try {
			choiceFacade.deleteChoice(id);
		} catch (ChoiceNotFoundException e) {
			return ResponseEntity.status(404).body(new ErrorDto(e.getMessage()));
		}
		
		log.trace(LogMessage.exitController);
		return ResponseEntity.status(HttpStatus.OK).body(new SuccessDto().getMessage());
	}

	@GetMapping("/choice/all")
	public ResponseEntity<?> getAllChoices() {

		log.trace(LogMessage.hitController);
		
		List<ChoiceDto> responseDtos = null;
		try {
			responseDtos = choiceFacade.getAllChoices();
		} catch (ChoiceNotFoundException e) {
			ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorDto(e.getMessage()));
		}
		
		log.trace(LogMessage.exitController);
		return ResponseEntity.ok(responseDtos);
	}
}
