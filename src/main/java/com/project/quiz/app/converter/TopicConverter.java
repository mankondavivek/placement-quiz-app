package com.project.quiz.app.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.project.quiz.app.dto.TopicDto;
import com.project.quiz.app.model.Topic;

@Component
public class TopicConverter implements Converter<Topic, TopicDto> {

	@Autowired
	private SubjectConverter subjectConverter;
	
	@Override
	public TopicDto convert(Topic source) {
		
		TopicDto topicDto = new TopicDto();
		
		topicDto.setId(source.getId());
		topicDto.setName(source.getName());
		topicDto.setSubjectDto(subjectConverter.convert(source.getSubject()));
		
		return topicDto;
	}

}
