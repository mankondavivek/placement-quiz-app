package com.project.quiz.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.quiz.app.model.Question;

public interface QuestionRepository extends CrudRepository<Question, Long> {

}
