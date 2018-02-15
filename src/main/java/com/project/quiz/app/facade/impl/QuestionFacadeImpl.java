package com.project.quiz.app.facade.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.project.quiz.app.dto.QuestionDto;
import com.project.quiz.app.exception.MissingParametersException;
import com.project.quiz.app.exception.QuestionAlreadyExistsException;
import com.project.quiz.app.exception.QuestionNotFoundException;
import com.project.quiz.app.facade.QuestionFacade;

import lombok.extern.log4j.Log4j;

@Log4j
@Component
public class QuestionFacadeImpl implements QuestionFacade {@Override
	public QuestionDto addQuestion(QuestionDto questionDto)
			throws QuestionAlreadyExistsException, MissingParametersException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QuestionDto getQuestion(long id) throws QuestionNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QuestionDto updateQuestion(QuestionDto questionDto)
			throws QuestionNotFoundException, MissingParametersException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteQuestion(long id) throws QuestionNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<QuestionDto> getAllQuestions() throws QuestionNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
