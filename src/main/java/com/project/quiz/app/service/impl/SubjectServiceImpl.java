package com.project.quiz.app.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.quiz.app.exception.MissingParametersException;
import com.project.quiz.app.exception.SubjectAlreadyExistsException;
import com.project.quiz.app.exception.SubjectNotFoundException;
import com.project.quiz.app.model.Subject;
import com.project.quiz.app.service.SubjectService;

import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class SubjectServiceImpl implements SubjectService {@Override
	public Subject addSubject(Subject subject) throws SubjectAlreadyExistsException, MissingParametersException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Subject getSubject(long id) throws SubjectNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Subject updateSubject(Subject subject) throws SubjectNotFoundException, MissingParametersException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSubject(long id) throws SubjectNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Subject> getAllSubjects() throws SubjectNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
