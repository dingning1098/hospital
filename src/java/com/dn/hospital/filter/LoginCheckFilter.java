package com.dn.hospital.filter;

import com.dn.hospital.entity.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginCheckFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) servletRequest;
		HttpServletResponse rep = (HttpServletResponse) servletResponse;
		User user = (User) req.getSession().getAttribute("user");
		if(user==null){
			req.setAttribute("messages","当前用户没有登陆");
			rep.sendRedirect(req.getContextPath()+"/index.jsp?error=true");
		}

	}

	@Override
	public void destroy() {

	}
}
