package com.skillIndia.dao;

import org.springframework.stereotype.Repository;

import com.skillIndia.model.Institution;

@Repository
public interface InstitutionDao {

	public void addInstitution(Institution p);//insert
	public void updateInstitution(Institution p);//update/modify
	public void removeInstitutionByName(String name);//delete/remove
	public Institution getInstitutionByName(String institutionName);
	
	
}
