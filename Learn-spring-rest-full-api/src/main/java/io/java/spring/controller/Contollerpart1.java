package io.java.spring.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class Contollerpart1 {
	private String encryptedstring;
	
	@GetMapping("/")
	@ResponseBody
	public String encryption(@RequestParam(value = "psw") String psw) {
		
		encryptedstring = "";
		 char c;
		 int size = psw.length()-1;
		 
		 for(int i=0;i<=size;i++) {
			 c= psw.charAt(i);
			 c= (char) ((int)c-i+2);
			 encryptedstring += Character.toString(c);
		 }
		
		return encryptedstring;
		
	}

}
