package com.micro.cust;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.ServletWebRequest;

@Controller
public class ErrorControllerCustom implements ErrorController {

	@Autowired
	private ErrorAttributes errorAttributes;

	@RequestMapping("/error")
	@ResponseBody
	public Map<String, Object> errorHandling(HttpServletRequest httpServletRequest) {

		ServletWebRequest servletWebRequest = new ServletWebRequest(httpServletRequest);
		@SuppressWarnings("deprecation")
		Map<String, Object> errors = errorAttributes.getErrorAttributes(servletWebRequest, true);
		errors.put("own", "MyTest");
		return errors;

	}

	@Override
	public String getErrorPath() {

		return "/error";
	}

}
