package com.project.quiz.app.service;

import java.util.List;

import com.project.quiz.app.exception.MissingParametersException;
import com.project.quiz.app.exception.SubjectAlreadyExistsException;
import com.project.quiz.app.exception.SubjectNotFoundException;
import com.project.quiz.app.model.Subject;

public interface SubjectService {
	
	public Subject addSubject(Subject subject) throws SubjectAlreadyExistsException, MissingParametersException;
	
	public Subject getSubject(long id) throws SubjectNotFoundException;
	
	public Subject updateSubject(Subject subject) throws SubjectNotFoundException, MissingParametersException;
	
	public void deleteSubject(long id) throws SubjectNotFoundException;
	
	public List<Subject> getAllSubjects() throws SubjectNotFoundException;
}