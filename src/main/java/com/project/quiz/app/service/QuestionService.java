package com.project.quiz.app.service;

import java.util.List;

import com.project.quiz.app.exception.MissingParametersException;
import com.project.quiz.app.exception.QuestionAlreadyExistsException;
import com.project.quiz.app.exception.QuestionNotFoundException;
import com.project.quiz.app.model.Question;

public interface QuestionService {

	
	public Question createQuestion(Question question) throws QuestionAlreadyExistsException, MissingParametersException;
	
	public Question readQuestion(long id) throws QuestionNotFoundException;
	
	public Question updateQuestion(Question question) throws QuestionNotFoundException;
	
	public void deleteQuestion(long id) throws QuestionNotFoundException;
	
	public List<Question> readAllQuestions() throws QuestionNotFoundException;
}
