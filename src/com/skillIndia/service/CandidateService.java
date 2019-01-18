package com.skillIndia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.skillIndia.model.Candidate;
import com.skillIndia.model.Course;

@Service
public interface CandidateService {

	public void addCandidate(Candidate candidate);
	public boolean verifyCandidate(String candidateUsername, String candidatePassword);
	public Candidate returnCandidate(Candidate candidate);
	public boolean loginCandidate(Candidate candidate);
	public List<Course> browseCourse();
	public void applyCourse(Course course, int id);
	public List<Course> listCourse(int UserId);
}
