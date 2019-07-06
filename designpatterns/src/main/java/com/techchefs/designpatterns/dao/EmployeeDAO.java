package com.techchefs.designpatterns.dao;

import java.util.ArrayList;

import com.techchefs.designpatterns.dto.EmployeeInfoBean;

public interface EmployeeDAO {

	EmployeeInfoBean getEmployeeInfo(String id);
	EmployeeInfoBean getEmployeeInfo(int id);
	ArrayList<EmployeeInfoBean> getAllEmployeeInfo();

}