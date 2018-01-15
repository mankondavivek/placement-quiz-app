package com.project.quiz.app.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.project.quiz.app.model.enums.DifficultyLevel;

import lombok.Data;

@Data
@Entity
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(unique = true, nullable = false, length = 1000)
	private String question;
	
	@OneToMany(mappedBy="question")
	private Set<Choice> choices;
	
	@Column(nullable = false)
	private DifficultyLevel difficultyLevel;
	
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	private Topic topic;
	
}
