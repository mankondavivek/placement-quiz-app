package com.project.quiz.app.service;

import java.util.List;

import com.project.quiz.app.exception.ChoiceAlreadyExistsException;
import com.project.quiz.app.exception.ChoiceNotFoundException;
import com.project.quiz.app.exception.MissingParametersException;
import com.project.quiz.app.model.Choice;

public interface ChoiceService {

	public Choice addChoice(Choice choice) throws ChoiceAlreadyExistsException, MissingParametersException;
	
	public Choice getChoice(long id) throws ChoiceNotFoundException;
	
	public Choice updateChoice(Choice choice) throws ChoiceNotFoundException, MissingParametersException;
	
	public void deleteChoice(long id) throws ChoiceNotFoundException;
	
	public List<Choice> getAllChoices() throws ChoiceNotFoundException;
	
}
