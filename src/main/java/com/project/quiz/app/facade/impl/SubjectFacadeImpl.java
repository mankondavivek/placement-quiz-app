package com.project.quiz.app.facade.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.quiz.app.converter.SubjectConverter;
import com.project.quiz.app.converter.SubjectDtoConverter;
import com.project.quiz.app.dto.SubjectDto;
import com.project.quiz.app.exception.MissingParametersException;
import com.project.quiz.app.exception.SubjectAlreadyExistsException;
import com.project.quiz.app.exception.SubjectNotFoundException;
import com.project.quiz.app.facade.SubjectFacade;
import com.project.quiz.app.model.Subject;
import com.project.quiz.app.service.SubjectService;
import com.project.quiz.app.utils.LogMessage;

import lombok.extern.log4j.Log4j;

@Log4j
@Component
public class SubjectFacadeImpl implements SubjectFacade {
	
	
	@Autowired
	private SubjectConverter subjectConverter;

	@Autowired
	private SubjectDtoConverter subjectDtoConverter;

	@Autowired
	private SubjectService subjectService;

	@Override
	public SubjectDto addSubject(SubjectDto subjectDto)
			throws SubjectAlreadyExistsException, MissingParametersException {

		log.trace(LogMessage.hitFacade);

		Subject subject = subjectDtoConverter.convert(subjectDto);
		subject = subjectService.addSubject(subject);
		subjectDto = subjectConverter.convert(subject);

		log.trace(LogMessage.exitFacade);
		return subjectDto;
	}

	@Override
	public SubjectDto getSubject(long id) throws SubjectNotFoundException {
		
		log.trace(LogMessage.hitFacade);
		
		Subject subject = subjectService.getSubject(id);
		
		log.trace(LogMessage.exitFacade);
		return subjectConverter.convert(subject);
	}

	@Override
	public SubjectDto updateSubject(SubjectDto subjectDto)
			throws SubjectNotFoundException, MissingParametersException {
		
		log.trace(LogMessage.hitFacade);
		
		Subject subject = subjectDtoConverter.convert(subjectDto);
		subject = subjectService.updateSubject(subject);
		subjectDto = subjectConverter.convert(subject);
		
		log.trace(LogMessage.exitFacade);
		return subjectDto;
	}

	@Override
	public void deleteSubject(long id) throws SubjectNotFoundException {
		
		log.trace(LogMessage.hitFacade);
		
		subjectService.deleteSubject(id);
		
		log.trace(LogMessage.exitFacade);
	}

	@Override
	public List<SubjectDto> getAllSubjects() throws SubjectNotFoundException {
		
		log.trace(LogMessage.hitFacade);
		
		List<Subject> subjects = subjectService.getAllSubjects();
		List<SubjectDto> subjectDtos= new ArrayList<SubjectDto>();
		
		for(Subject subject : subjects) {
			subjectDtos.add(subjectConverter.convert(subject));
		}
		
		log.trace(LogMessage.exitFacade);
		return subjectDtos;
	}
}
