package com.capgemini.itransform.adminservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.itransform.adminservice.entity.Course;
import com.capgemini.itransform.adminservice.service.AdminService;

@RestController
@CrossOrigin("*")
public class AdminController {

	@Autowired
	AdminService service;
	
	@PostMapping("/course")
	public ResponseEntity<Course> addCourse(@RequestBody Course course){
		return new ResponseEntity<Course>(service.addCourse(course),HttpStatus.CREATED);
	}
	
	
}
