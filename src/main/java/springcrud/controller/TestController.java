package springcrud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springcrud.model.Person;

@RestController
@RequestMapping("/test")
public class TestController {


	//@GetMapping("/person")
	 @RequestMapping("/greeting")
	public Person getPersonList() {
System.out.println(" in method");
		Person p = new Person();
		p.setId("3");
		p.setName("ash");
		return p;

	}

}
