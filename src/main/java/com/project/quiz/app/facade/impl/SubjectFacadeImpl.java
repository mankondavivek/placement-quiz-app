package com.project.quiz.app.facade.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.project.quiz.app.dto.SubjectDto;
import com.project.quiz.app.exception.MissingParametersException;
import com.project.quiz.app.exception.SubjectAlreadyExistsException;
import com.project.quiz.app.exception.SubjectNotFoundException;
import com.project.quiz.app.facade.SubjectFacade;

import lombok.extern.log4j.Log4j;

@Log4j
@Component
public class SubjectFacadeImpl implements SubjectFacade {@Override
	public SubjectDto addSubject(SubjectDto subjectDto)
			throws SubjectAlreadyExistsException, MissingParametersException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubjectDto getSubject(long id) throws SubjectNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubjectDto updateSubject(SubjectDto subjectDto) throws SubjectNotFoundException, MissingParametersException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSubject(long id) throws SubjectNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<SubjectDto> getAllSubjects() throws SubjectNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
