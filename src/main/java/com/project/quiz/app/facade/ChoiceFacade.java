package com.project.quiz.app.facade;

import java.util.List;

import com.project.quiz.app.exception.ChoiceAlreadyExistsException;
import com.project.quiz.app.exception.ChoiceNotFoundException;
import com.project.quiz.app.exception.MissingParametersException;
import com.project.quiz.app.dto.ChoiceDto;

public interface ChoiceFacade {

	public ChoiceDto addChoice(ChoiceDto choiceDto) throws ChoiceAlreadyExistsException, MissingParametersException;

	public ChoiceDto getChoice(long id) throws ChoiceNotFoundException;

	public ChoiceDto updateChoice(ChoiceDto choiceDto) throws ChoiceNotFoundException, MissingParametersException;

	public void deleteChoice(long id) throws ChoiceNotFoundException;

	public List<ChoiceDto> getAllChoices() throws ChoiceNotFoundException;
}
