package com.skillIndia.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Course implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(unique=true)
	private int courseId;
	private String courseName;
	private String courseDescription;
	private int courseDuration;
	
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseDescription="
				+ courseDescription + ", courseDuration=" + courseDuration + ", establishmentId=" + establishmentId
				+ ", requestStatus=" + requestStatus + "]";
	}
	@Column
    private int establishmentId;
	
	@Column
    private String requestStatus;

	public String getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

	public int getEstablishmentId() {
		return establishmentId;
	}

	public void setEstablishmentId(int establishmentId) {
		this.establishmentId = establishmentId;
	}

	//SuperClass Constructor
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//parameterized constructor
	public Course(int courseId, String courseName, String courseDescription, int courseDuration) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.courseDuration = courseDuration;
	}
	
	//getters and setters
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
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	public int getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}
	
	
}
