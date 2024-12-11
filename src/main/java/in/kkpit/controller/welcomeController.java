package in.kkpit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class welcomeController {
	@GetMapping("/msg")
	public ModelAndView getMsg(@RequestParam String name) {
		String msgTxt=name+"How Are You";
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg","Hlo"+msgTxt+"....");
		mav.setViewName("index");
		return mav;
		
	}
	@GetMapping("/msgx")
	public String getMsgg(@RequestParam String name,Model mode) {
		String msgTxt=name+"How Are You";
		
		mode.addAttribute("msg","Hlo"+msgTxt+".... Namaskaram");
		
		return "index";
		
	}
	
	@GetMapping("/box")
	public ModelAndView getTrew(@RequestParam String name,@RequestParam String sur) {
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg","FirstName: "+name+" "+sur+"Last name: ");
		mav.setViewName("index");
		return mav;
	}
	@GetMapping("/book")
	public ModelAndView getBookData(@RequestParam String name, @RequestParam String author) {

		System.out.println("Name :: " + name);
		System.out.println("Author ::" + author);

		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", name + " By " + author + " is out of stock...");

		mav.setViewName("index");

		return mav;
	}

}
