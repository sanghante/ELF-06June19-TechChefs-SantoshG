package com.tc.empspringrest.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@JsonRootName("employee-response")
public class EmployeeResponse {
	
	@JsonProperty("statusCode")
	private int statusCode;
	
	private String message;
	
	private String description;

}
