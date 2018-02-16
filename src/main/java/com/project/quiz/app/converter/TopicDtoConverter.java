package com.project.quiz.app.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.project.quiz.app.dto.TopicDto;
import com.project.quiz.app.model.Topic;

@Component
public class TopicDtoConverter implements Converter<TopicDto, Topic> {

	@Override
	public Topic convert(TopicDto source) {
		// TODO Auto-generated method stub
		return null;
	}
}
