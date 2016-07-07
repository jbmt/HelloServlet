package test.servlet.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.util.ReflectionUtils;
import org.springframework.web.servlet.DispatcherServlet;

import test.servlet.service.IMainService;

public class MainController {
	
	@Autowired
	IMainService mainService;

	public MainController() {
		// TODO Auto-generated constructor stub
		DispatcherServlet s;
		ReflectionUtils rl;
		ReflectionTestUtils rtl;
	}

}
