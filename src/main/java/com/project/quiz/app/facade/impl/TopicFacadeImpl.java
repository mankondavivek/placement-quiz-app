package com.project.quiz.app.facade.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.project.quiz.app.dto.TopicDto;
import com.project.quiz.app.exception.MissingParametersException;
import com.project.quiz.app.exception.TopicAlreadyExistsException;
import com.project.quiz.app.exception.TopicNotFoundException;
import com.project.quiz.app.facade.TopicFacade;

import lombok.extern.log4j.Log4j;

@Log4j
@Component
public class TopicFacadeImpl implements TopicFacade {@Override
	public TopicDto addTopic(TopicDto topicDto) throws TopicAlreadyExistsException, MissingParametersException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TopicDto getTopic(long id) throws TopicNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TopicDto updateTopic(TopicDto topicDto) throws TopicNotFoundException, MissingParametersException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteTopic(long id) throws TopicNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TopicDto> getAllTopics() throws TopicNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
