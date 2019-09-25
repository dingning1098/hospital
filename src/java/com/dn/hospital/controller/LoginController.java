package com.dn.hospital.controller;

import com.dn.hospital.entity.User;
import com.dn.hospital.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/reg")
public class LoginController {
	@Autowired
	private UserService userService;
	@RequestMapping("/login")
	public String login(User user, HttpServletRequest request) {
		//将uname放入session作用域中，这样转发页面也可以取到这个数据。
		String userName = user.getUsername();
		User u = userService.get(userName);
		if(u!=null){
			if(u.getPwd()!=null&&u.getPwd().equals(user.getPwd())){
				request.getSession().setAttribute("new_user",u);
				return  "loginSuccess";
			}
		}
		request.setAttribute("messages","登陆失败");

		return  "forward:/index.jsp";
	}
	@RequestMapping("/reg")
	public String reg(HttpServletRequest request, HttpServletResponse response){
		return "reg";
	}
	@RequestMapping("/save")
	public String save(User user, HttpServletResponse response, HttpServletRequest request){
		if(StringUtils.isEmpty(user.getUsername())||StringUtils.isEmpty(user.getPwd())||StringUtils.isEmpty(user.getIdcard())||StringUtils.isEmpty(user.getName())||StringUtils.isEmpty(user.getTel())){
			request.setAttribute("messages","信息不能为空！！");
			return "reg";
		}
		User u  = userService.get(user.getUsername());
		if(u!=null){
			request.setAttribute("messages","用户名已存在！");
			return "reg";
		}
		userService.insert(user);
		request.setAttribute("messages","注册成功请登录！");
		return "forward:/index.jsp";
	}

	@RequestMapping("/logout")
	public String logout(HttpServletResponse response,HttpServletRequest request){
		request.getSession().invalidate();
		return "forward:/index.jsp";
	}
}
