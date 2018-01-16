package com.project.quiz.app.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.project.quiz.app.dto.TopicDto;
import com.project.quiz.app.model.Topic;

@Component
public class TopicConverter implements Converter<Topic, TopicDto> {

	@Override
	public TopicDto convert(Topic arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
