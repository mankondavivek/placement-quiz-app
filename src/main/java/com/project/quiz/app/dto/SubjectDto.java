package com.project.quiz.app.dto;

import java.util.Set;

import lombok.Data;

@Data
public class SubjectDto {

	private long id;
	
	private String name;
	
	private Set<TopicDto> topicDtos;
}
