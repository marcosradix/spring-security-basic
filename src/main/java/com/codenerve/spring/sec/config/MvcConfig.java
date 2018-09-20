/*
 * Copyright (c) 2018 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */
package com.codenerve.spring.sec.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MvcConfig  {


	@GetMapping("/")
	public String home1() {
		return "login";
	}

	@GetMapping("index")
	public String home() {
		return "index";
	}

	@GetMapping("login")
	public String admin() {
		return "login";
	}

}


