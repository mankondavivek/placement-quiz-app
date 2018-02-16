package com.project.quiz.app.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.project.quiz.app.dto.ChoiceDto;
import com.project.quiz.app.model.Choice;

@Component
public class ChoiceDtoConverter implements Converter<ChoiceDto, Choice> {

	@Override
	public Choice convert(ChoiceDto source) {
		// TODO Auto-generated method stub
		return null;
	}
}
