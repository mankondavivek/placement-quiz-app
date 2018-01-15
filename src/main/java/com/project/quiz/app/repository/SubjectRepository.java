package com.project.quiz.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.quiz.app.model.Subject;

public interface SubjectRepository extends CrudRepository<Subject, Long> {

}
