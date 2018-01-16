package com.project.quiz.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.quiz.app.model.Question;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Long> {

}
