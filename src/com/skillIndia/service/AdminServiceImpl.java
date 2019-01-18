package com.skillIndia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillIndia.dao.AdminDao;
import com.skillIndia.model.Candidate;
import com.skillIndia.model.Course;
import com.skillIndia.model.Establishment;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	public AdminDao adminDao;
	@Override
	public List<Course> listAllCourse() {
		// TODO Auto-generated method stub
		return adminDao.listAllCourse();
	}

	@Override
	public void acceptCandidate(int UserId) {
		// TODO Auto-generated method stub
	adminDao.acceptCandidate(UserId);
	}

	@Override
	public void rejectCandidate(int UserId) {
		adminDao.rejectCandidate(UserId);
		
	}

	@Override
	public void acceptEstablishment(int estId) {
		adminDao.acceptEstablishment(estId);
		
	}

	@Override
	public void rejectEstablishment(int estId) {
		adminDao.rejectEstablishment(estId);
	
	}

	@Override
	public void verifyContract(int estId) {
		adminDao.verifyContract(estId);
		
	}

	@Override
	public List<Candidate> listAllCandidate() {
		return adminDao.listAllCandidate();
	}

	@Override
	public List<Establishment> listAllEstablishment() {
		return adminDao.listAllEstablishment();
	}

}
