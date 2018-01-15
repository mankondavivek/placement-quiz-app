package com.project.quiz.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.quiz.app.model.Choice;

public interface ChoiceRepository extends CrudRepository<Choice, Long> {

}
