package com.project.quiz.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.quiz.app.model.Choice;

@Repository
public interface ChoiceRepository extends CrudRepository<Choice, Long> {

}
