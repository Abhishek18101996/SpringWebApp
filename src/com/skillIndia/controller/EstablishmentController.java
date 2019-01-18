package com.skillIndia.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skillIndia.model.Candidate;
import com.skillIndia.model.Course;
import com.skillIndia.model.Establishment;
import com.skillIndia.service.EstablishmentService;

@Controller
public class EstablishmentController {

	@Autowired
	EstablishmentService establishmentServiceObject;

	public void setEstablishmentServiceObject(EstablishmentService establishmentServiceObject) {
		this.establishmentServiceObject = establishmentServiceObject;
	}
	
	@RequestMapping("/EstablishmentRegistration")
	public String showEstablishmentRegPage(Model model) {
		model.addAttribute("establishment", new Establishment());
		return "EstablishmentRegistration";
	}
	
	//To add a Candidate
		@RequestMapping(value = "/adde", 
				method = RequestMethod.POST)
		public String addEstablishment(
				@ModelAttribute("establishment") 
				@Valid Establishment establishment, 
				BindingResult result, 
				Model model) {
			if(!result.hasErrors())
			{// new establishment, add it
					this.establishmentServiceObject.addEstablishment(establishment);
			}
				return "EstablishmentLogin";
			}
	
		

	@RequestMapping(value = "/establishmentlogin")
	public String LoginPage1(Model model,HttpSession session) {
		
		model.addAttribute("establishment", new Establishment());
		return "EstablishmentLogin";
	}
	
	
	@RequestMapping(value="/establishmentloginprocess",method=RequestMethod.POST)
	public ModelAndView establishmentLogin(@ModelAttribute("establishment")
	@Valid Establishment establishment, BindingResult result,
	Model model,HttpSession session, HttpServletRequest request) {
		ModelAndView mav =new ModelAndView();
		if(this.establishmentServiceObject.loginEstablishment(establishment)) {
		Establishment logEstablishment = this.establishmentServiceObject.returnEstablishment(establishment);
		session.setAttribute("establishment", logEstablishment);
			Integer id = logEstablishment.getEstId();
			session.setAttribute("establishmentId", id);
			session.setAttribute("establishmentName", logEstablishment.getEstName());
			mav.addObject("establishment", establishment.getEstId());
			mav.setViewName("EstablishmentDashboard");
		}
		else {
			mav.setViewName("error");
	}
	return mav;	
	}
	
	@RequestMapping(value="/addCourse",method=RequestMethod.GET)
	public String addCourse(Model model, HttpSession session) {
		model.addAttribute("course", new Course());
		return "AddCourse";
	}
	
	@RequestMapping(value="/addingcourse", 
			method = RequestMethod.POST)
	public String addCrop(@ModelAttribute("course") 
				@Valid Course course, 
				BindingResult result, 
				Model model,HttpSession session) {
		course.setRequestStatus("PENDING");
	Establishment e=(Establishment)session.getAttribute("establishment");
		this.establishmentServiceObject.addCourse(course);
		return "EstablishmentDashboard";
		
	}

	@RequestMapping(value="/listCourse",method = RequestMethod.GET)
	public String courseStatus(Model model,HttpSession session)
	{
	Integer id=(Integer)session.getAttribute("establishmentId");
		List<Course> courseList=this.establishmentServiceObject.listCourses(id);
		System.out.println(courseList);
		model.addAttribute("CourseList",courseList);
		return "EstablishmentCourses";
	}
	
	@RequestMapping(value="/signoute",method= RequestMethod.GET)
	public String signout(	Model model ,HttpSession session)
	{
		session.invalidate();
		model.addAttribute("establishment",new Establishment());
		return "EstablishmentLogin";
	}
	
}
