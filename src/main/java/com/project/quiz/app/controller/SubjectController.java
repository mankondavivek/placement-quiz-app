package com.project.quiz.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.quiz.app.facade.SubjectFacade;

import lombok.extern.log4j.Log4j;

@Log4j
@RestController
@RequestMapping("/subject/quiz/api")
public class SubjectController {

	@Autowired
	private SubjectFacade subjectFacade;
	
}
