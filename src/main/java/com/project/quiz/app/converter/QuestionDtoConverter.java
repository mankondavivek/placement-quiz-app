package com.project.quiz.app.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.project.quiz.app.dto.QuestionDto;
import com.project.quiz.app.model.Question;

@Component
public class QuestionDtoConverter implements Converter<QuestionDto, Question> {

	@Autowired
	private TopicDtoConverter topicDtoConverter;
	
	@Override
	public Question convert(QuestionDto source) {
		
		Question question = new  Question();
		
		question.setId(source.getId());
		question.setQuestion(source.getQuestion());
		question.setDifficultyLevel(source.getDifficultyLevel());
		question.setTopic(topicDtoConverter.convert(source.getTopicDto()));
		
		return question;
	}

}
