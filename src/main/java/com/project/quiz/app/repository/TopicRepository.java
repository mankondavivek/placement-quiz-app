package com.project.quiz.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.quiz.app.model.Topic;

@Repository
public interface TopicRepository extends CrudRepository<Topic, Long> {

}
