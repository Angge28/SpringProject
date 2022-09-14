package biz.global77.controller;

//import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import biz.global77.model.Learner;
import biz.global77.model.LearnerCourse;
import biz.global77.repo.LearnerCourseRepo;
import biz.global77.repo.LearnerRepo;

@Controller
public class LearnerController {
	
	@Autowired
	LearnerRepo learnerRepo;
	
	@Autowired
	LearnerCourseRepo courseRepo;
 
	
	@RequestMapping(value = "/enrol", method = RequestMethod.GET)
	public ModelAndView showForm() {
		return new ModelAndView("enrol", "learner", new Learner());
	}
	
	@RequestMapping(value = "/saveLearner", method = RequestMethod.POST)
	public String submit(@Valid @ModelAttribute("learnerForm") Learner learner,
		
		BindingResult result, ModelMap model) {
		
		if(result.hasErrors()) {
			System.out.println(result);
			return "enrol";
		}
		 
		learnerRepo.save(learner);
		
		LearnerCourse course = new LearnerCourse();
		course.setDescription("Intro to Java");
		course.setTitle("Java 101");
//		course.setLearner(learner);
		
		courseRepo.save(course);
		
		
		// add message to model
		model.addAttribute("listOfLearners", learnerRepo.findAll());		
		return "list";
		
	}
	
//	@RequestMapping(value = "/learnerAction", method = RequestMethod.POST)
//	public String submit(@Valid @ModelAttribute("learnerForm") Learner learner,	BindingResult result, ModelMap model) {
//		
//		if(result.hasErrors()) {
//			return "enrol";
//		}
//		
//		learnerRepo.save(learner);
//		
//		String message = "We welcome you.. " + learner.getLearnerName();
//		String message1 = ", aged " + learner.getLearnerAge();
//		String message2 = ", with the employee ID of " + learner.getEmployeeId();
//		String message3 = ", and email add of " + learner.getEmailId();
//		
//		// add message to model
//		model.addAttribute("message", message  +  message1 + message2 + message3);
//		model.addAttribute("learnerName", learner.getLearnerName());
//		model.addAttribute("learnerAge", learner.getLearnerAge());
//		
//		return "acknowledge";
//		
//	}
	
		@RequestMapping(value = "/list", method = RequestMethod.GET)
		public ModelAndView listLearner() {
			return new ModelAndView("listOfLearners", "listOfLearners", learnerRepo.findAll());
		}
		
}
  