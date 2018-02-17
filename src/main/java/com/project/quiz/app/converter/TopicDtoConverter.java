package com.project.quiz.app.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.project.quiz.app.dto.TopicDto;
import com.project.quiz.app.model.Topic;

@Component
public class TopicDtoConverter implements Converter<TopicDto, Topic> {

	@Autowired
	private SubjectDtoConverter subjectDtoConverter;
	
	@Override
	public Topic convert(TopicDto source) {
		
		Topic topic = new Topic();
		
		topic.setId(source.getId());
		topic.setName(source.getName());
		topic.setSubject(subjectDtoConverter.convert(source.getSubjectDto()));
		
		return topic;
	}
}
