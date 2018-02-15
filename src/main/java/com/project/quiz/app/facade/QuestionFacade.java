package com.project.quiz.app.facade;

import java.util.List;

import com.project.quiz.app.dto.QuestionDto;
import com.project.quiz.app.exception.MissingParametersException;
import com.project.quiz.app.exception.QuestionAlreadyExistsException;
import com.project.quiz.app.exception.QuestionNotFoundException;


public interface QuestionFacade {

	public QuestionDto addQuestion(QuestionDto questionDto) throws QuestionAlreadyExistsException, MissingParametersException;
	
	public QuestionDto getQuestion(long id) throws QuestionNotFoundException;
	
	public QuestionDto updateQuestion(QuestionDto questionDto) throws QuestionNotFoundException, MissingParametersException;
	
	public void deleteQuestion(long id) throws QuestionNotFoundException;
	
	public List<QuestionDto> getAllQuestions() throws QuestionNotFoundException;
	
}
