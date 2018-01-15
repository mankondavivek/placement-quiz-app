package com.project.quiz.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.quiz.app.model.Topic;

public interface TopicRepository extends CrudRepository<Topic, Long> {

}
