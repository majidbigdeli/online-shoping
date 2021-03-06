package net.kzn.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("Hello", "wellcome to spring  mvc");
		return mv;
	}

	@RequestMapping(value = "/test")
	public ModelAndView test(@RequestParam(value="Hello",required=false)String Hello ) {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("Hello", Hello);
		return mv;
	}

}
