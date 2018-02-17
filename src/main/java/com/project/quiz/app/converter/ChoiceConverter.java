package com.project.quiz.app.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.project.quiz.app.dto.ChoiceDto;
import com.project.quiz.app.model.Choice;

@Component
public class ChoiceConverter implements Converter<Choice, ChoiceDto> {

	@Autowired
	private QuestionConverter questionConverter;
	
	@Override
	public ChoiceDto convert(Choice source) {
		
		ChoiceDto choiceDto = new ChoiceDto();
		 
		
		choiceDto.setId(source.getId());
		choiceDto.setQuestionDto(questionConverter.convert(source.getQuestion()));
		choiceDto.setValue(source.getValue());
		choiceDto.setCorrect(source.isCorrect());
		
		return choiceDto;
	}

}
