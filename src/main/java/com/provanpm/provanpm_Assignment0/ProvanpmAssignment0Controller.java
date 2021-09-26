package com.provanpm.provanpm_Assignment0;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProvanpmAssignment0Controller {

	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
}
