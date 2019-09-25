package com.dn.hospital.controller;

import com.dn.hospital.entity.Patient;
import com.dn.hospital.entity.User;
import com.dn.hospital.service.PatientService;
import com.dn.hospital.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/patient")
public class PatientController {
	@Autowired
	private PatientService patientService;
	@Autowired
	private UserService userService;

	@RequestMapping("/search")
	public String search(HttpServletRequest request, HttpServletResponse response){
		List<Patient> plist = patientService.search();
		request.setAttribute("plist",plist);

		return "patientList";
	}


}
