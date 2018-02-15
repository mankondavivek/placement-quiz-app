package com.project.quiz.app.facade;

import java.util.List;

import com.project.quiz.app.exception.MissingParametersException;
import com.project.quiz.app.exception.SubjectAlreadyExistsException;
import com.project.quiz.app.exception.SubjectNotFoundException;
import com.project.quiz.app.dto.SubjectDto;

public interface SubjectFacade {
	
public SubjectDto addSubject(SubjectDto subjectDto) throws SubjectAlreadyExistsException, MissingParametersException;
	
	public SubjectDto getSubject(long id) throws SubjectNotFoundException;
	
	public SubjectDto updateSubject(SubjectDto subjectDto) throws SubjectNotFoundException, MissingParametersException;
	
	public void deleteSubject(long id) throws SubjectNotFoundException;
	
	public List<SubjectDto> getAllSubjects() throws SubjectNotFoundException;
	
}
