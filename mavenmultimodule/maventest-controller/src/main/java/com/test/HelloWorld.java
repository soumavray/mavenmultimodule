package com.test;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.service.HelloWorldService;

@Controller
public class HelloWorld {

	@RequestMapping("/hello")
	public String hello(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {

		model.addAttribute("name", name);
		//returns the view name
		
		HelloWorldService hs = new HelloWorldService();
		String retValue = hs.helloservice();
		return retValue;
		//return "history";

	}
}