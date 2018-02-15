package com.project.quiz.app.service;

import java.util.List;

import com.project.quiz.app.exception.MissingParametersException;
import com.project.quiz.app.exception.TopicAlreadyExistsException;
import com.project.quiz.app.exception.TopicNotFoundException;
import com.project.quiz.app.model.Topic;

public interface TopicService {

	public Topic addTopic(Topic topic) throws TopicAlreadyExistsException, MissingParametersException;
	
	public Topic getTopic(long id) throws TopicNotFoundException;
	
	public Topic updateTopic(Topic topic) throws TopicNotFoundException, MissingParametersException;
	
	public void deleteTopic(long id) throws TopicNotFoundException;
	
	public List<Topic> getAllTopics() throws TopicNotFoundException;
}
