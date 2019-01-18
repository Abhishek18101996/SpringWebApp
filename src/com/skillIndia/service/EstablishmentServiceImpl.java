package com.skillIndia.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillIndia.dao.EstablishmentDao;
import com.skillIndia.model.Candidate;
import com.skillIndia.model.Course;
import com.skillIndia.model.Establishment;

@Service
public class EstablishmentServiceImpl implements EstablishmentService{

	@Autowired
	EstablishmentDao establishmentDaoObject;
	
	
	public EstablishmentDao getEstablishmentDaoObject() {
		return establishmentDaoObject;
	}

	@Override
	public void addEstablishment(Establishment establishment) {
		establishmentDaoObject.addEstablishment(establishment);
	}

	@Override
	public void updateEstablishment(Establishment establishment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeEstablishmentByName(String establishmentName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCourse(Course establishmentCourse) {
		establishmentDaoObject.addCourse(establishmentCourse);
	}

	@Override
	public void evaluateCandidate(Candidate candidateProgress) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Course> listCourses(int EstId) {
		return establishmentDaoObject.listCourses(EstId);
	}

	@Override
	public List<Candidate> listCandidates() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean loginEstablishment(Establishment establishment) {
		return establishmentDaoObject.loginEstablishment(establishment);
	}

	@Override
	public Establishment returnEstablishment(Establishment establishment) {
		return establishmentDaoObject.returnEstablishment(establishment);
	}

	

}
