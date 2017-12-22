package com.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping(value = "lo")
@Controller
public class LoginAction {
	@RequestMapping(value = "login")
	public ModelAndView login(ModelAndView model, String username, String password) {

		if ("admin".equals(username) && "password".equals(password)) {
			model.setViewName("index");

		} else {
			model.setViewName("login");
		}

		return model;

	}
}
