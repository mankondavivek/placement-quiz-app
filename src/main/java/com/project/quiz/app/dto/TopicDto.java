package com.project.quiz.app.dto;

import java.util.Set;

import lombok.Data;

@Data
public class TopicDto {

	private long id;

	private String name;

	private Set<QuestionDto> questionDtos;

	private SubjectDto subjectDto;
}
