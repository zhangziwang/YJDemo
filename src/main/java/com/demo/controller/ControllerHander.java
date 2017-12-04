package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller


public class ControllerHander {
	@RequestMapping("/login")
	public String name() {
		System.out.println("================");
		return "login";
	}
}
