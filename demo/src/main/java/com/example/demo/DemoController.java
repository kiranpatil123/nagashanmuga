package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DemoController {
	@Autowired
	ServiceDemo service;

	/*@SuppressWarnings("unused")
	@RequestMapping(value = "/hello")
	public String saveEmployee() {
		Employee emp = new Employee();
		emp.setEid(1);
		emp.setEname("patil");
		emp.setEmail("patil.kiran906");
		String string = service.saveEmployee(emp);
		System.out.println("HELLO");
		return "hi welcome";

	}
@RequestMapping(value="/hi")
	public Employee getEMployee() {
		Employee employee = service.getEmployee("101");
		return employee;

	}
*/
	@RequestMapping("/hi")
	public String m1(){
		
		return "welcome.html";
		
	}
}
