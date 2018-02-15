package com.project.quiz.app.facade;

import java.util.List;

import com.project.quiz.app.exception.MissingParametersException;
import com.project.quiz.app.exception.TopicAlreadyExistsException;
import com.project.quiz.app.exception.TopicNotFoundException;
import com.project.quiz.app.dto.TopicDto;

public interface TopicFacade {
	
public TopicDto addTopic(TopicDto topicDto) throws TopicAlreadyExistsException, MissingParametersException;
	
	public TopicDto getTopic(long id) throws TopicNotFoundException;
	
	public TopicDto updateTopic(TopicDto topicDto) throws TopicNotFoundException, MissingParametersException;
	
	public void deleteTopic(long id) throws TopicNotFoundException;
	
	public List<TopicDto> getAllTopics() throws TopicNotFoundException;
	
}
