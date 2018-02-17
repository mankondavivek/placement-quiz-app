package com.project.quiz.app.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.project.quiz.app.dto.SubjectDto;
import com.project.quiz.app.model.Subject;

@Component
public class SubjectDtoConverter implements Converter<SubjectDto, Subject> {

	@Override
	public Subject convert(SubjectDto source) {
		
		Subject subject = new Subject();
		
		subject.setId(source.getId());
		subject.setName(source.getName());
		
		return subject;
	}
}
