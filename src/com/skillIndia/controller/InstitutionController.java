package com.skillIndia.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.skillIndia.exception.CustomException;
import com.skillIndia.model.Institution;
import com.skillIndia.service.InstitutionService;

@Controller
public class InstitutionController {

	public InstitutionService institutionService;

	@Autowired
	public void setInstitutionService(InstitutionService institutionService) {
		this.institutionService = institutionService;
	}
	
	@RequestMapping(value="/institution/add", method = RequestMethod.POST)
	@ExceptionHandler({CustomException.class})
	public void addInstitution(@ModelAttribute("institution") @Valid Institution institution,
			BindingResult result, Model model)
	{
		if(!result.hasErrors()) {
			if(institution.getInstituteName()==null) {
				this.institutionService.addInstitution(institution);
			}
			else {
				this.institutionService.addInstitution(institution);
			}
		}
	}
	


	@RequestMapping(value="edit/{institution_Name}")
	public void updateInstitution(@PathVariable("institution_Name") String name, Model model) 
	{
		Institution institutionUpdate = this.institutionService.getInstitutionByName(name);
		model.addAttribute("institution", institutionUpdate);
	}
	
	@RequestMapping("/remove/{institution_Name}")
	public void removeInstitution(@PathVariable("institution_Name") String name,
			Model model) {
		if(name!=null) {
			this.institutionService.removeInstitutionByName(name);
		}
		else {
			throw new CustomException("Given Candidate Not Found", "404");
		}
	}
}
