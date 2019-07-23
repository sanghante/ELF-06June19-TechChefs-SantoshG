package com.techchefs.hibernateapp.dto;

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

@Data
public class TrainingInfoBean {
	
	private int courseId ; 
	private String courseName;
	private String duration;
	private String courseType;


}
