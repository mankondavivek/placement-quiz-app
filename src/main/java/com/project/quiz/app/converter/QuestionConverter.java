package com.project.quiz.app.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.project.quiz.app.dto.QuestionDto;
import com.project.quiz.app.model.Question;

@Component
public class QuestionConverter implements Converter<Question, QuestionDto> {

	@Override
	public QuestionDto convert(Question arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
