package com.capgemini.itransform.adminservice.entity;

import org.springframework.data.annotation.Id;

public class Course {
	
	@Id
	private int courseId;
	private String courseName;
	private String courseImage;
	private CourseChapter courseChapter[];
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseImage() {
		return courseImage;
	}
	public void setCourseImage(String courseImage) {
		this.courseImage = courseImage;
	}
	public CourseChapter[] getCourseChapter() {
		return courseChapter;
	}
	public void setCourseChapter(CourseChapter[] courseChapter) {
		this.courseChapter = courseChapter;
	}
	
	

}
