package springcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class TestMVCController {

	@ResponseBody
	@RequestMapping("/home")
	public ModelAndView  getPersonList(Model model) {
		System.out.println(" in method of testmvc modified sdf");
		ModelAndView mv=new ModelAndView("sample");
		return mv;
		//return "sample";

	}

}
