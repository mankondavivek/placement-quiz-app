package com.project.quiz.app.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	
	/**
	 * The below method redirects control to the "begintest.html" page, thereby
	 *	preventing "begintest.html" from being specified explicitly in the URL
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/")
	public void redirectToLogin(HttpServletResponse response) throws IOException {
		response.sendRedirect("/views/index.html");
	}
	@RequestMapping(value = "/admin")
	public void redirectToAdmin(HttpServletResponse response) throws IOException {
		response.sendRedirect("/views/admin.html");
	}
}