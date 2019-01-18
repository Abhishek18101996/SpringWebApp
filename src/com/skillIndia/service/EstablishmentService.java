package com.skillIndia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.skillIndia.model.Candidate;
import com.skillIndia.model.Course;
import com.skillIndia.model.Establishment;

@Service
public interface EstablishmentService {

	public void addEstablishment(Establishment p);//insert
	public void updateEstablishment(Establishment p);//update/modify
	public void removeEstablishmentByName(String name);//delete/remove
	public void addCourse(Course establishmentCourse);//Establishment adds courses available with its organisation
	public void evaluateCandidate(Candidate candidateProgress);//Establishment evaluates candidate based on its behaviour and performance during course
	public List<Course> listCourses(int EstId);
	public List<Candidate> listCandidates();
	public boolean loginEstablishment(Establishment establishment);
	public Establishment returnEstablishment(Establishment establishment);
	
}
