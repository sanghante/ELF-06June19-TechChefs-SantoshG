package com.tc.empspringrest.controller;

import static com.tc.empspringrest.common.EMPConstants.*;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tc.empspringrest.beans.EmployeeAddressInfoBean;
import com.tc.empspringrest.beans.EmployeeEducationInfoBean;
import com.tc.empspringrest.beans.EmployeeExperienceInfoBean;
import com.tc.empspringrest.beans.EmployeeInfoBean;
import com.tc.empspringrest.beans.EmployeeOtherInfoBean;
import com.tc.empspringrest.beans.EmployeeResponse;
import com.tc.empspringrest.dao.EmployeeDao;

@RestController
@RequestMapping("/employee")
@PropertySource(PROPERTY_FILENAME)
public class EmployeeController {

	@Autowired
	@Qualifier(DB_INTERACTION_TYPE)
	EmployeeDao dao;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}

	@DeleteMapping(path = "/removeEmployee", produces = { MediaType.APPLICATION_JSON_VALUE })
	public EmployeeResponse deleteEmployee(@RequestParam("id") int id, HttpServletRequest request) {
		EmployeeResponse response = new EmployeeResponse();
		if (request.getSession(false) != null) {
			Boolean result = dao.deleteEmployeeInfo(id);
			if (result) {
				response.setStatusCode(201);
				response.setMessage(SUCCESS);
				response.setDescription("Employee data inserted successfully");
			} else {
				response.setStatusCode(401);
				response.setMessage(FAILURE);
				response.setDescription("Employee data could not be inserted successfully");
			}
		} else {
			response.setStatusCode(501);
			response.setMessage(FAILURE);
			response.setDescription("Please login first");
		}
		return response;
	}

	@GetMapping(path = "/getEmployee", produces = { MediaType.APPLICATION_JSON_VALUE })
	public EmployeeResponse getEmployee(int id, HttpServletRequest request) {
		EmployeeResponse response = new EmployeeResponse();
		if (request.getSession(false) != null) {
			EmployeeInfoBean bean = dao.getEmployeeInfo(id);
			if (bean != null) {
				response.setStatusCode(201);
				response.setMessage(SUCCESS);
				response.setDescription("Employee data found successfully");
				response.setBeans(Arrays.asList(bean));
			} else {
				response.setStatusCode(401);
				response.setMessage(FAILURE);
				response.setDescription("Employee data not found");
			}
		} else {
			response.setStatusCode(501);
			response.setMessage(FAILURE);
			response.setDescription("Please login first");
		}
		return response;
	}

	@GetMapping(path = "/getAllEmployee", produces = { MediaType.APPLICATION_JSON_VALUE })
	public EmployeeResponse getAllEmployee(HttpServletRequest request) {
		EmployeeResponse response = new EmployeeResponse();
		if (request.getSession(false) != null) {
			List<EmployeeInfoBean> beans = dao.getAllEmployeeInfo();
			if (beans != null) {
				response.setStatusCode(201);
				response.setMessage(SUCCESS);
				response.setDescription("Employee data found successfully");
				response.setBeans(beans);
			} else {
				response.setStatusCode(401);
				response.setMessage(FAILURE);
				response.setDescription("Employee data not found");
				response.setBeans(beans);
			}
		} else {
			response.setStatusCode(501);
			response.setMessage(FAILURE);
			response.setDescription("Please login first");
		}
		return response;
	}

	@PostMapping(path = "/createEmployee", produces = { MediaType.APPLICATION_JSON_VALUE })
	public EmployeeResponse addEmployee(@RequestBody EmployeeInfoBean bean, HttpServletRequest request) {

		EmployeeResponse response = new EmployeeResponse();

		List<EmployeeEducationInfoBean> eduBeans = bean.getEducationInfoBeans();
		for (EmployeeEducationInfoBean employeeEducationInfoBean : eduBeans) {
			employeeEducationInfoBean.getEducationPKBean().setInfoBean(bean);
		}
		List<EmployeeAddressInfoBean> addressBeans = bean.getAddressInfoBeans();
		for (EmployeeAddressInfoBean employeeAddressInfoBean : addressBeans) {
			employeeAddressInfoBean.getAddressPKBean().setInfoBean(bean);
		}
		List<EmployeeExperienceInfoBean> expBeans = bean.getExperienceInfoBeans();
		for (EmployeeExperienceInfoBean employeeExperienceInfoBean : expBeans) {
			employeeExperienceInfoBean.getExperiencePKBean().setInfoBean(bean);
		}

		EmployeeOtherInfoBean otherInfo = bean.getOtherInfo();
		otherInfo.setInfoBean(bean);

		bean.setMngrId(dao.getEmployeeInfo(bean.getMngrId().getId()));
		boolean result = dao.createEmployeeInfo(bean);
		if (result) {
			response.setStatusCode(201);
			response.setMessage(SUCCESS);
			response.setDescription("Employee data inserted successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage(FAILURE);
			response.setDescription("Employee data could not be inserted");
		}
		return response;

	}

	@PutMapping(path = "/updateEmployee", produces = { MediaType.APPLICATION_JSON_VALUE })
	public EmployeeResponse updateEmployee(EmployeeInfoBean bean, int managerId, HttpServletRequest request) {

		EmployeeResponse response = new EmployeeResponse();
		if (request.getSession(false) != null) {
			List<EmployeeEducationInfoBean> eduBeans = bean.getEducationInfoBeans();
			for (EmployeeEducationInfoBean employeeEducationInfoBean : eduBeans) {
				employeeEducationInfoBean.getEducationPKBean().setInfoBean(bean);
			}
			List<EmployeeAddressInfoBean> addressBeans = bean.getAddressInfoBeans();
			for (EmployeeAddressInfoBean employeeAddressInfoBean : addressBeans) {
				employeeAddressInfoBean.getAddressPKBean().setInfoBean(bean);
			}
			List<EmployeeExperienceInfoBean> expBeans = bean.getExperienceInfoBeans();
			for (EmployeeExperienceInfoBean employeeExperienceInfoBean : expBeans) {
				employeeExperienceInfoBean.getExperiencePKBean().setInfoBean(bean);
			}

			EmployeeOtherInfoBean otherInfo = bean.getOtherInfo();
			otherInfo.setInfoBean(bean);

			bean.setMngrId(dao.getEmployeeInfo(managerId));
			boolean result = dao.updateEmployeeInfo(bean);
			if (result) {
				response.setStatusCode(201);
				response.setMessage(SUCCESS);
				response.setDescription("Employee data updated successfully");
			} else {
				response.setStatusCode(401);
				response.setMessage(FAILURE);
				response.setDescription("Employee data could not be updated");
			}
		} else {
			response.setStatusCode(501);
			response.setMessage(FAILURE);
			response.setDescription("Please login first");
		}
		return response;
	}
}
