package com.skillIndia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillIndia.dao.CandidateDao;
import com.skillIndia.model.Candidate;
import com.skillIndia.model.Course;

@Service
public class CandidateServiceImpl implements CandidateService{

	@Autowired
	CandidateDao candidateDaoObject;
	
	public void setCandidateDaoObject(CandidateDao candidateDaoObject) {
		this.candidateDaoObject = candidateDaoObject;
	}

	@Override
	public void addCandidate(Candidate candidate) {
		candidateDaoObject.addCandidate(candidate);
	}

	@Override
	public boolean verifyCandidate(String candidateUsername, String candidatePassword) {
		return candidateDaoObject.verifyCandidate(candidateUsername, candidatePassword);
	}

	@Override
	public Candidate returnCandidate(Candidate candidate) {	
		System.out.println("in service returnCandidate()");
		return candidateDaoObject.returnCandidate(candidate);
	}

	@Override
	public boolean loginCandidate(Candidate candidate) {
		return candidateDaoObject.loginCandidate(candidate);
	}

	@Override
	public List<Course> browseCourse() {
		return candidateDaoObject.browseCourse();
	}

	
	@Override
	public List<Course> listCourse(int UserId) {
		return candidateDaoObject.listCourse(UserId);
	}

	@Override
	public void applyCourse(Course course, int id) {
		this.candidateDaoObject.applyCourse(course, id);
	}

}
