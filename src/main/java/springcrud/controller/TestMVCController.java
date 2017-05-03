package springcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class TestMVCController {

	
	@RequestMapping("/home")
	public String  getPersonList() {
		System.out.println(" in method of testmvc modified");
		//ModelAndView mv=new ModelAndView("sample");
		return "sample";

	}

}
