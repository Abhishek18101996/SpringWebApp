package com.skillIndia.service;

import org.springframework.stereotype.Service;

import com.skillIndia.model.Institution;

@Service
public interface InstitutionService {
	public void addInstitution(Institution p);//insert
	public void updateInstitution(Institution p);//update/modify
	public void removeInstitutionByName(String name);//delete/remove
	public Institution getInstitutionByName(String institutionName);
}
