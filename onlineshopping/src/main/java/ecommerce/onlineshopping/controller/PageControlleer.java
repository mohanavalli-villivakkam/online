package ecommerce.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageControlleer{
	
	@RequestMapping(value= {"/", "/home", "/index"})
	public ModelAndView index() {
		ModelAndView mv =new ModelAndView("page");
		mv.addObject("greeting","Welcome to spring Web MVC");
		return mv;
		
		
	}
	@RequestMapping(value="/test")
	public ModelAndView test(@RequestParam(value="greeting",required=false)String greeting) {
		if(greeting==null) {
			greeting="heloo there";
		}
	
		ModelAndView mv =new ModelAndView("page");
		mv.addObject("greeting",greeting);
		return mv;
	}
	}


