package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "QUIZ_QUESTIONS")

public class Questions {
	
	@Id
	private Integer id;
	
	@Column(name = "QUESTION_CONTENT")
	private String content;
	
	@Column(name = "QUESTION_TYPE")
	private String type;
	
	@Column(name = "QUESTION_LEVEL")
	private String level;

}
