package com.project.quiz.app.facade.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.quiz.app.converter.TopicConverter;
import com.project.quiz.app.converter.TopicDtoConverter;
import com.project.quiz.app.dto.TopicDto;
import com.project.quiz.app.exception.MissingParametersException;
import com.project.quiz.app.exception.TopicAlreadyExistsException;
import com.project.quiz.app.exception.TopicNotFoundException;
import com.project.quiz.app.facade.TopicFacade;
import com.project.quiz.app.model.Topic;
import com.project.quiz.app.service.TopicService;
import com.project.quiz.app.utils.LogMessage;

import lombok.extern.log4j.Log4j;

@Log4j
@Component
public class TopicFacadeImpl implements TopicFacade {
	
	@Autowired
	private TopicConverter topicConverter;

	@Autowired
	private TopicDtoConverter topicDtoConverter;

	@Autowired
	private TopicService topicService;

	@Override
	public TopicDto addTopic(TopicDto topicDto)
			throws TopicAlreadyExistsException, MissingParametersException {

		log.trace(LogMessage.hitFacade);

		Topic topic = topicDtoConverter.convert(topicDto);
		topic = topicService.addTopic(topic);
		topicDto = topicConverter.convert(topic);

		log.trace(LogMessage.exitFacade);
		return topicDto;
	}

	@Override
	public TopicDto getTopic(long id) throws TopicNotFoundException {
		
		log.trace(LogMessage.hitFacade);
		
		Topic topic = topicService.getTopic(id);
		
		log.trace(LogMessage.exitFacade);
		return topicConverter.convert(topic);
	}

	@Override
	public TopicDto updateTopic(TopicDto topicDto)
			throws TopicNotFoundException, MissingParametersException {
		
		log.trace(LogMessage.hitFacade);
		
		Topic topic = topicDtoConverter.convert(topicDto);
		topic = topicService.updateTopic(topic);
		topicDto = topicConverter.convert(topic);
		
		log.trace(LogMessage.exitFacade);
		return topicDto;
	}

	@Override
	public void deleteTopic(long id) throws TopicNotFoundException {
		
		log.trace(LogMessage.hitFacade);
		
		topicService.deleteTopic(id);
		
		log.trace(LogMessage.exitFacade);
	}

	@Override
	public List<TopicDto> getAllTopics() throws TopicNotFoundException {
		
		log.trace(LogMessage.hitFacade);
		
		List<Topic> topics = topicService.getAllTopics();
		List<TopicDto> topicDtos= new ArrayList<TopicDto>();
		
		for(Topic topic : topics) {
			topicDtos.add(topicConverter.convert(topic));
		}
		
		log.trace(LogMessage.exitFacade);
		return topicDtos;
	}
}
