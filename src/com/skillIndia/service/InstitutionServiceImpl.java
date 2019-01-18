package com.skillIndia.service;

import org.springframework.stereotype.Service;

import com.skillIndia.dao.InstitutionDao;
import com.skillIndia.model.Institution;

@Service
public class InstitutionServiceImpl implements InstitutionService {

	private InstitutionDao institutedao;

	@Override
	public void addInstitution(Institution p) {
		institutedao.addInstitution(p);
	}

	@Override
	public void updateInstitution(Institution p) {
		institutedao.updateInstitution(p);
	}

	@Override
	public void removeInstitutionByName(String name) {
		institutedao.removeInstitutionByName(name);
	}

	@Override
	public Institution getInstitutionByName(String institutionName) {
		// TODO Auto-generated method stub
		return null;
	}

}
