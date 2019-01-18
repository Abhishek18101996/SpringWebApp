package com.skillIndia.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.skillIndia.model.Candidate;
import com.skillIndia.model.Course;
import com.skillIndia.model.Establishment;

@Repository
public interface EstablishmentDao {

	public void addEstablishment(Establishment p);//insert
	public void updateEstablishment(Establishment p);//update/modify
	public Establishment returnEstablishment(Establishment establishment);
	public void removeEstablishmentByName(String name);//delete/remove
	public void addCourse(Course establishmentCourse);//Establishment adds courses available with its organisation
	public void evaluateCandidate(Candidate candidateProgress);//Establishment evaluates candidate based on its behaviour and performance during course
	public List<Course> listCourses(int EstId);
	public List<Candidate> listCandidates();
	public boolean loginEstablishment(Establishment establishment);
}
