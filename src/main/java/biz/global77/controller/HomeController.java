package biz.global77.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	@RequestMapping(value = {"/", "/home"})
	public String home() {
		return "home";
	}
	
//	@RequestMapping(value="/")
//	public String test(HttpServletResponse response) throws IOException{
//		return "redirect:/home";
//	} 
//
//	@RequestMapping(value="/home")	
//	public ModelAndView home(HttpServletResponse response) throws IOException{
//		return new ModelAndView("home");
//	}
//	
//	@RequestMapping(value="/about_us")
//	public ModelAndView about_us(HttpServletResponse response) throws IOException{
//		return new ModelAndView("about_us");
//	}
}