package com.project.quiz.app.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.quiz.app.exception.ChoiceAlreadyExistsException;
import com.project.quiz.app.exception.ChoiceNotFoundException;
import com.project.quiz.app.exception.MissingParametersException;
import com.project.quiz.app.model.Choice;
import com.project.quiz.app.service.ChoiceService;

import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class ChoiceServiceImpl implements ChoiceService {@Override
	public Choice addChoice(Choice choice) throws ChoiceAlreadyExistsException, MissingParametersException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Choice getChoice(long id) throws ChoiceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Choice updateChoice(Choice choice) throws ChoiceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteChoice(long id) throws ChoiceNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Choice> getAllChoices() throws ChoiceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
