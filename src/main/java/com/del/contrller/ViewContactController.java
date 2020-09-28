package com.del.contrller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.del.command.Contact;
import com.del.service.ContactService;
@Controller
public class ViewContactController {
	@Autowired
	private ContactService service;
	
	public String handleAddCtctHyperLink(Model model){ 
		 return "";
		}
	
	@GetMapping("/editContact")
	public String editContact(@RequestParam("cid") Integer cid, Model model) {
		Contact contact=service.getContactById(cid);
		model.addAttribute("contact",contact);
		return "index"; 
		}
	
	@GetMapping("/deleteContact")
	public String deleteContact(@RequestParam("cid") Integer cid , RedirectAttributes attribute){ 
		 service.deleteContactById(cid);
		attribute.addFlashAttribute("delmsg", "Contact has been deleted successfully");
	return "redirect:/viewContacts";
		}
}
