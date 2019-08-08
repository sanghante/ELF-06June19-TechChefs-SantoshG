package com.techchefs.emp.controller;

import static com.techchefs.emp.commons.EMPConstants.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techchefs.emp.dao.EmployeeDAO;
import com.techchefs.emp.manytoone.EmployeeAddressInfoBean;
import com.techchefs.emp.manytoone.EmployeeEducationInfoBean;
import com.techchefs.emp.manytoone.EmployeeExperienceInfoBean;
import com.techchefs.emp.onetoone.EmployeeInfoBean;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	@Qualifier(DB_INTERACTION_TYPE)
	EmployeeDAO empDao;

	@GetMapping("/search")
	public String employeeSearch(String userId, HttpServletRequest req) {

		ArrayList<EmployeeInfoBean> beans = empDao.getAllEmployeeInfo(userId);
		req.setAttribute("beanList", beans);
		return VIEW_SEARCH_RESULT_PAGE;
	}

	@InitBinder
	public void customBinder(WebDataBinder binder) {
		CustomDateEditor customDateEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, customDateEditor);
	}

	@GetMapping("/createEmployee")
	public String createEmployee() {
		return "createEmployee";
	}

	@PostMapping("/saveEmployee")
	public String saveEmployee(ModelMap modelMap, EmployeeInfoBean empBean) {

		List<EmployeeEducationInfoBean> eduBeans = empBean.getEducationInfoBeans();
		List<EmployeeAddressInfoBean> addrBeans = empBean.getAddressInfoBeans();
		List<EmployeeExperienceInfoBean> expBeans = empBean.getExperienceInfoBeans();

		for (EmployeeAddressInfoBean employeeAddressInfoBean : addrBeans) {
			employeeAddressInfoBean.getAddressPKBean().setInfoBean(empBean);
		}

		for (EmployeeEducationInfoBean employeeEduInfoBean : eduBeans) {
			employeeEduInfoBean.getEducationPKBean().setInfoBean(empBean);
		}

		for (EmployeeExperienceInfoBean employeeExperienceInfoBean : expBeans) {
			employeeExperienceInfoBean.getExperiencePKBean().setInfoBean(empBean);
		}
		
		empBean.getOtherInfoBean().setEmployeeInfoBean(empBean);

		if (empDao.createEmployeeInfo(empBean)) {
			modelMap.addAttribute("empBean", empBean);
			return VIEW_HOME_PAGE;

		} else {
			modelMap.addAttribute("msg", "Unable to save DB, try again later");
			return "createEmployee";
		}
	}
}
