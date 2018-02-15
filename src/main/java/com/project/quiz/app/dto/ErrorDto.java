package com.project.quiz.app.dto;

import lombok.Data;

@Data
public class ErrorDto {

	private String message;
	
	public ErrorDto(String message) {
		
		this.message = message;
	}
	
	
}
