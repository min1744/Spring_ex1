package com.iu.s1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@RequestMapping(value = {"/go3", "/go4"}, method = RequestMethod.POST)
	public String go4() {
		return "";
	}
	
	@RequestMapping(value = "/go3", method = RequestMethod.GET)
	public String go3() {
		return "ex/test3";
	}
	
	@RequestMapping(value = "/ex/go2", method = {RequestMethod.GET, RequestMethod.POST})
	public String go2() {
		return "test2";
	}
	
	@RequestMapping(value = "/go1", params = "p1")
	public String go1() {
		return "test1";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";//home.jsp를 찾기
	}	
}