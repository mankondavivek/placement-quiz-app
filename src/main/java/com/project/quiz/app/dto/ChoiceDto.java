package com.project.quiz.app.dto;

import lombok.Data;

@Data
public class ChoiceDto {

	private long id;

	private String value;

	private boolean isCorrect;

	private QuestionDto questionDto;
}
