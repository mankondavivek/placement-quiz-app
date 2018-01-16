package com.project.quiz.app.dto;

import java.util.Set;

import com.project.quiz.app.model.enums.DifficultyLevel;

import lombok.Data;

@Data
public class QuestionDto {

	private long id;

	private String question;
	
	private Set<ChoiceDto> choiceDtos;
	
	private DifficultyLevel difficultyLevel;
	
	private TopicDto topicDto;
}
