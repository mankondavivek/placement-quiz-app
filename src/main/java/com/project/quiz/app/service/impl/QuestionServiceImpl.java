package com.project.quiz.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.quiz.app.exception.MissingParametersException;
import com.project.quiz.app.exception.QuestionAlreadyExistsException;
import com.project.quiz.app.exception.QuestionNotFoundException;
import com.project.quiz.app.model.Question;
import com.project.quiz.app.repository.QuestionRepository;
import com.project.quiz.app.service.QuestionService;

import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	private QuestionRepository questionRepository;

	@Override
	public Question createQuestion(Question question)
			throws QuestionAlreadyExistsException, MissingParametersException {

		log.trace("Entered Question Service.");

		if (question.getQuestion() == null) {
			throw new MissingParametersException();
		}
		if (question.getChoices().isEmpty()) {
			throw new MissingParametersException();
		}
		if (question.getTopic() == null) {
			throw new MissingParametersException();
		}
		if (questionRepository.findByQuestion(question.getQuestion()) != null) {
			throw new QuestionAlreadyExistsException();
		}
		if (questionRepository.findByQuestionAndChoices(question.getQuestion(), question.getChoices()) != null) {
			throw new QuestionAlreadyExistsException();
		}

		Question savedQuestion = questionRepository.save(question);

		log.trace("Created new Question");
		return savedQuestion;
	}

	@Override
	public Question readQuestion(long id) throws QuestionNotFoundException {

		Question question = questionRepository.findOne(id);

		if (question == null) {
			throw new QuestionNotFoundException();
		}
		return question;
	}

	@Override
	public Question updateQuestion(Question question) throws QuestionNotFoundException {

		Question questionToBeUpdated = questionRepository.findOne(question.getId());

		if (questionToBeUpdated == null) {
			throw new QuestionNotFoundException();
		}
		questionToBeUpdated = questionRepository.save(question);

		return questionToBeUpdated;
	}

	@Override
	public void deleteQuestion(long id) throws QuestionNotFoundException {

		Question questionToBeDeleted = questionRepository.findOne(id);

		if (questionToBeDeleted == null) {
			throw new QuestionNotFoundException();
		}
		questionRepository.delete(id);
	}

	@Override
	public List<Question> readAllQuestions() throws QuestionNotFoundException {

		List<Question> questions = (List<Question>) questionRepository.findAll();
		if(questions.isEmpty()) {
			throw new QuestionNotFoundException();
		}
		return questions;
	}
}
