package com.project.quiz.app.converter;

import org.springframework.core.convert.converter.Converter;

import com.project.quiz.app.dto.QuestionDto;
import com.project.quiz.app.model.Question;

public class QuestionDtoConverter implements Converter<QuestionDto, Question> {

	@Override
	public Question convert(QuestionDto source) {
		// TODO Auto-generated method stub
		return null;
	}

}
