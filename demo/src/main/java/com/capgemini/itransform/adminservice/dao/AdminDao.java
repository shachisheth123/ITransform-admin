package com.capgemini.itransform.adminservice.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.itransform.adminservice.entity.Course;

@Repository
public interface AdminDao extends MongoRepository<Course, Integer> {

	public Course addCourse(); 
}
