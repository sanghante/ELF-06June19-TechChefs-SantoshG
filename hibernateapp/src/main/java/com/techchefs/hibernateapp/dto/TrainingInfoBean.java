package com.techchefs.hibernateapp.dto;

import java.io.Serializable;

/*
 * 
 * TRAINING_TYPE
-------------
COURSE_ID	(INT)
COURSE_NM	(VARCHAR)
DURATION	(VARCHAR)
TYPE		(VARCHAR)

 */

import lombok.Data;

@SuppressWarnings("serial")
@Data
public class TrainingInfoBean implements Serializable {
	
	private int courseId ; 
	private String courseName;
	private String duration;
	private String courseType;


}
