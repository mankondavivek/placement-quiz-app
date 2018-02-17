package com.project.quiz.app.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.project.quiz.app.dto.SubjectDto;
import com.project.quiz.app.model.Subject;

@Component
public class SubjectConverter implements Converter<Subject, SubjectDto> {

	@Override
	public SubjectDto convert(Subject source) {
		
		SubjectDto subjectDto = new SubjectDto();
		
		subjectDto.setId(source.getId());
		subjectDto.setName(source.getName());
		
		return subjectDto;
	}
}
