package com.skillIndia.dao;
 import java.util.List;

import org.springframework.stereotype.Repository;

import com.skillIndia.model.Candidate;
import com.skillIndia.model.Course;
import com.skillIndia.model.Establishment;

@Repository
public interface AdminDao {

	public List<Course>  listAllCourse();
	
	public List<Candidate>  listAllCandidate();
	
	public List<Establishment>  listAllEstablishment();
	
	public void acceptCandidate(int UserId);
	public void rejectCandidate(int UserId);
	
	public void acceptEstablishment(int estId);
	public void rejectEstablishment(int estId);
	
	public void verifyContract(int estId);
	
	
}
