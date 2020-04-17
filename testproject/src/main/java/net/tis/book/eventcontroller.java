package net.tis.book;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class eventcontroller {
	
	private static final Logger logger = LoggerFactory.getLogger(eventcontroller.class);
	@Inject
	@Autowired
	EventDAO dao;
	
	@Autowired
	private ServletContext application;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/eventtable.do", method = RequestMethod.GET)
	public String home(Model model) {
//		model.addAttribute("", 1);
		return "eventtable";
	}
	
}
