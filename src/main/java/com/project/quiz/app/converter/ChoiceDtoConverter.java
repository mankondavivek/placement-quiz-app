package com.project.quiz.app.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.project.quiz.app.dto.ChoiceDto;
import com.project.quiz.app.model.Choice;

@Component
public class ChoiceDtoConverter implements Converter<ChoiceDto, Choice> {

	@Autowired
	private QuestionDtoConverter questionDtoConverter;
	
	@Override
	public Choice convert(ChoiceDto source) {
		
		Choice choice = new Choice();
		
		choice.setId(source.getId());
		choice.setQuestion(questionDtoConverter.convert(source.getQuestionDto()));
		choice.setValue(source.getValue());
		choice.setCorrect(source.isCorrect());
		
		return choice;
	}
}
