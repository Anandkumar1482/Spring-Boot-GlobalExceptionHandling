package com.micro.controller;

import java.util.Random;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ErrorController {

	@RequestMapping(value = "/showa", method = RequestMethod.GET)
	public String showa() {
		if (new Random().nextInt(10) > 5) {
			throw new RuntimeErrorException(null, "Exception");
		}
		return "welcome";
	}

	@RequestMapping(value = "/showb", method = RequestMethod.GET)
	public String showb() throws NotFoundException {
		if (new Random().nextInt(10) > 5) {
			throw new NotFoundException("Exception");
		}
		return "welcome";
	}

	@RequestMapping(value = "/showc", method = RequestMethod.GET)
	public String showc() throws NotMentionException {
		if (new Random().nextInt(10) > 5) {
			throw new NotMentionException("not metion correctly");
		}
		return "welcome";
	}
}