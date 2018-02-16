package com.project.quiz.app.facade.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.quiz.app.converter.QuestionConverter;
import com.project.quiz.app.converter.QuestionDtoConverter;
import com.project.quiz.app.dto.QuestionDto;
import com.project.quiz.app.exception.MissingParametersException;
import com.project.quiz.app.exception.QuestionAlreadyExistsException;
import com.project.quiz.app.exception.QuestionNotFoundException;
import com.project.quiz.app.facade.QuestionFacade;
import com.project.quiz.app.model.Question;
import com.project.quiz.app.service.QuestionService;
import com.project.quiz.app.utils.LogMessage;

import lombok.extern.log4j.Log4j;

@Log4j
@Component
public class QuestionFacadeImpl implements QuestionFacade {

	@Autowired
	private QuestionConverter questionConverter;

	@Autowired
	private QuestionDtoConverter questionDtoConverter;

	@Autowired
	private QuestionService questionService;

	@Override
	public QuestionDto addQuestion(QuestionDto questionDto)
			throws QuestionAlreadyExistsException, MissingParametersException {

		log.trace(LogMessage.hitFacade);

		Question question = questionDtoConverter.convert(questionDto);
		question = questionService.addQuestion(question);
		questionDto = questionConverter.convert(question);

		log.trace(LogMessage.exitFacade);
		return questionDto;
	}

	@Override
	public QuestionDto getQuestion(long id) throws QuestionNotFoundException {
		
		log.trace(LogMessage.hitFacade);
		
		Question question = questionService.getQuestion(id);
		
		log.trace(LogMessage.exitFacade);
		return questionConverter.convert(question);
	}

	@Override
	public QuestionDto updateQuestion(QuestionDto questionDto)
			throws QuestionNotFoundException, MissingParametersException {
		
		log.trace(LogMessage.hitFacade);
		
		Question question = questionDtoConverter.convert(questionDto);
		question = questionService.updateQuestion(question);
		questionDto = questionConverter.convert(question);
		
		log.trace(LogMessage.exitFacade);
		return questionDto;
	}

	@Override
	public void deleteQuestion(long id) throws QuestionNotFoundException {
		
		log.trace(LogMessage.hitFacade);
		
		questionService.deleteQuestion(id);
		
		log.trace(LogMessage.exitFacade);
	}

	@Override
	public List<QuestionDto> getAllQuestions() throws QuestionNotFoundException {
		
		log.trace(LogMessage.hitFacade);
		
		List<Question> questions = questionService.getAllQuestions();
		List<QuestionDto> questionDtos= new ArrayList<QuestionDto>();
		
		for(Question question : questions) {
			questionDtos.add(questionConverter.convert(question));
		}
		
		log.trace(LogMessage.exitFacade);
		return questionDtos;
	}
}
