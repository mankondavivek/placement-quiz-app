package com.project.quiz.app.facade.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.project.quiz.app.dto.ChoiceDto;
import com.project.quiz.app.exception.ChoiceAlreadyExistsException;
import com.project.quiz.app.exception.ChoiceNotFoundException;
import com.project.quiz.app.exception.MissingParametersException;
import com.project.quiz.app.facade.ChoiceFacade;

import lombok.extern.log4j.Log4j;

@Log4j
@Component
public class ChoiceFacadeImpl implements ChoiceFacade {@Override
	public ChoiceDto addChoice(ChoiceDto choiceDto) throws ChoiceAlreadyExistsException, MissingParametersException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChoiceDto getChoice(long id) throws ChoiceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChoiceDto updateChoice(ChoiceDto choiceDto) throws ChoiceNotFoundException, MissingParametersException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteChoice(long id) throws ChoiceNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ChoiceDto> getAllChoices() throws ChoiceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
