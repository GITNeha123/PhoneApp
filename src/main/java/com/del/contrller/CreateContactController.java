package com.del.contrller;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.del.command.Contact;
import com.del.service.ContactService;

@Controller
public class CreateContactController {
	 private static final org.apache.logging.log4j.Logger logger =  LogManager.getLogger(CreateContactController.class);
	
	@Autowired
	private ContactService service;
	
	@GetMapping(value= {"/","loadForm"})
	 public String loadForm(Model model) {
		 logger.info("Form loading ===================...");
		Contact con=new Contact();
		model.addAttribute("contact", con);
		 logger.info("Form loaded successfully================================.");
		 return "index";
	 } // to display form
	 
	@PostMapping("/saveContact")
	 public String handleSubmitBtn(@ModelAttribute("contact") Contact c, RedirectAttributes model) { // form submission
		 logger.info("Contact is saving =================@@");
		boolean isSaved=service.saveContact(c);
		if(isSaved) {
			if(c.getCid()!=null) {
			model.addFlashAttribute("susmsg","Contact has Updated succefully...");

			}
			else {
				model.addFlashAttribute("susmsg","Contact has Saved succefully...");
				 logger.info("Contact is saved successfully=================@@");
			}
		}
		else
			model.addFlashAttribute("errmsg","Contact did not Saved...");
		//	 return "index";
			 return "redirect:loadForm";
	 } 
	
	@GetMapping("/viewContacts")
	 public String handleViewCtctsHyperlink(Model model) { // hyperlink
		List<Contact> allContacts=service.getAllContacts();
		model.addAttribute("contacts", allContacts);
		  return "viewContact";
	 }
}
