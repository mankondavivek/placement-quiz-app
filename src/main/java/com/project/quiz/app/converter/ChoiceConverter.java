package com.project.quiz.app.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.project.quiz.app.dto.ChoiceDto;
import com.project.quiz.app.model.Choice;

@Component
public class ChoiceConverter implements Converter<Choice, ChoiceDto> {

	@Override
	public ChoiceDto convert(Choice arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
