package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface BaseDao extends CrudRepository<Employee, String> {

}
