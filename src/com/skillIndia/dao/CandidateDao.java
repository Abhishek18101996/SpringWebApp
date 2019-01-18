package com.skillIndia.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.skillIndia.model.Candidate;
import com.skillIndia.model.Course;

@Repository
public interface CandidateDao {

	public void addCandidate(Candidate candidate);
	public boolean verifyCandidate(String candidateUsername, String candidatePassword);
	
	public Candidate returnCandidate(Candidate candidate);

	public boolean loginCandidate(Candidate candidate);
	public List<Course> browseCourse();
	
	public List<Course> listCourse(int UserId);
	
	//public void applyCourse(Course course, int id);
	public void applyCourse(Course course, int id);
}
