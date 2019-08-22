package com.capgemini.itransform.adminservice.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.itransform.adminservice.dao.AdminDao;
import com.capgemini.itransform.adminservice.entity.Course;

public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminDao dao;

	@Override
	public Course addCourse(Course course) {
	
		return dao.save(course);
	}

}
