package com.project.quiz.app.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.project.quiz.app.dto.QuestionDto;
import com.project.quiz.app.model.Question;

@Component
public class QuestionConverter implements Converter<Question, QuestionDto> {

	@Autowired
	private TopicConverter topicConverter;
	
	@Override
	public QuestionDto convert(Question source) {
		
		QuestionDto questionDto = new QuestionDto();
		
		questionDto.setId(source.getId());
		questionDto.setQuestion(source.getQuestion());
		questionDto.setTopicDto(topicConverter.convert(source.getTopic()));
		questionDto.setDifficultyLevel(source.getDifficultyLevel());
		
		return questionDto;
	}

}
