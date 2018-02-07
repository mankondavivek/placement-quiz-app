package com.project.quiz.app.repository;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.quiz.app.model.Choice;
import com.project.quiz.app.model.Question;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Long> {

	Question findByQuestion(String question);

	Question findByQuestionAndChoices(String question, Set<Choice> choices);

}
