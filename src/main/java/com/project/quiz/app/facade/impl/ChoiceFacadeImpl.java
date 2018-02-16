package com.project.quiz.app.facade.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.quiz.app.converter.ChoiceConverter;
import com.project.quiz.app.converter.ChoiceDtoConverter;
import com.project.quiz.app.dto.ChoiceDto;
import com.project.quiz.app.exception.ChoiceAlreadyExistsException;
import com.project.quiz.app.exception.ChoiceNotFoundException;
import com.project.quiz.app.exception.MissingParametersException;
import com.project.quiz.app.facade.ChoiceFacade;
import com.project.quiz.app.model.Choice;
import com.project.quiz.app.service.ChoiceService;
import com.project.quiz.app.utils.LogMessage;

import lombok.extern.log4j.Log4j;

@Log4j
@Component
public class ChoiceFacadeImpl implements ChoiceFacade {
	
	@Autowired
	private ChoiceConverter ChoiceConverter;

	@Autowired
	private ChoiceDtoConverter ChoiceDtoConverter;

	@Autowired
	private ChoiceService ChoiceService;

	@Override
	public ChoiceDto addChoice(ChoiceDto ChoiceDto)
			throws ChoiceAlreadyExistsException, MissingParametersException {

		log.trace(LogMessage.hitFacade);

		Choice Choice = ChoiceDtoConverter.convert(ChoiceDto);
		Choice = ChoiceService.addChoice(Choice);
		ChoiceDto = ChoiceConverter.convert(Choice);

		log.trace(LogMessage.exitFacade);
		return ChoiceDto;
	}

	@Override
	public ChoiceDto getChoice(long id) throws ChoiceNotFoundException {
		
		log.trace(LogMessage.hitFacade);
		
		Choice Choice = ChoiceService.getChoice(id);
		
		log.trace(LogMessage.exitFacade);
		return ChoiceConverter.convert(Choice);
	}

	@Override
	public ChoiceDto updateChoice(ChoiceDto ChoiceDto)
			throws ChoiceNotFoundException, MissingParametersException {
		
		log.trace(LogMessage.hitFacade);
		
		Choice Choice = ChoiceDtoConverter.convert(ChoiceDto);
		Choice = ChoiceService.updateChoice(Choice);
		ChoiceDto = ChoiceConverter.convert(Choice);
		
		log.trace(LogMessage.exitFacade);
		return ChoiceDto;
	}

	@Override
	public void deleteChoice(long id) throws ChoiceNotFoundException {
		
		log.trace(LogMessage.hitFacade);
		
		ChoiceService.deleteChoice(id);
		
		log.trace(LogMessage.exitFacade);
	}

	@Override
	public List<ChoiceDto> getAllChoices() throws ChoiceNotFoundException {
		
		log.trace(LogMessage.hitFacade);
		
		List<Choice> Choices = ChoiceService.getAllChoices();
		List<ChoiceDto> ChoiceDtos= new ArrayList<ChoiceDto>();
		
		for(Choice Choice : Choices) {
			ChoiceDtos.add(ChoiceConverter.convert(Choice));
		}
		
		log.trace(LogMessage.exitFacade);
		return ChoiceDtos;
	}
}
