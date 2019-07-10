package io.java.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contollerpart1 {
	
	@RequestMapping(value="/",method =RequestMethod.GET)
	@ResponseBody
	String Welcome() {
		return "Wlencome to spring";
	}
	
	@RequestMapping(value="/hello2", method = RequestMethod.POST )
	@ResponseBody
	public String satyhello2() {
		return "Wlencome to spring";
	}

}
