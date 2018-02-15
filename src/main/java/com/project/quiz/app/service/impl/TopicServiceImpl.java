package com.project.quiz.app.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.quiz.app.exception.MissingParametersException;
import com.project.quiz.app.exception.TopicAlreadyExistsException;
import com.project.quiz.app.exception.TopicNotFoundException;
import com.project.quiz.app.model.Topic;
import com.project.quiz.app.service.TopicService;

import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class TopicServiceImpl implements TopicService {@Override
	public Topic addTopic(Topic topic) throws TopicAlreadyExistsException, MissingParametersException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Topic getTopic(long id) throws TopicNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Topic updateTopic(Topic topic) throws TopicNotFoundException, MissingParametersException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteTopic(long id) throws TopicNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Topic> getAllTopics() throws TopicNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
