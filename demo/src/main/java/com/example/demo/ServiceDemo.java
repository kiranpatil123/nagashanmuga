package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceDemo {
	@Autowired
	BaseDao dao;
	 
	
	public String saveEmployee(Employee emp){
		System.out.println("hi");
		dao.save(emp);
		System.out.println("hi");
		return "data is stored into data base";
		
	}
	
	public Employee getEmployee(String eid){
		Employee employee = dao.findOne(eid);
		return employee;
		//icgc@1234@4477
	}

}
