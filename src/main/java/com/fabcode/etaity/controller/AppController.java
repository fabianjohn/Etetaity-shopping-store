package com.fabcode.etaity.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fabcode.etaity.dao.AccountDAO;
import com.fabcode.etaity.entity.Account;


import jakarta.servlet.http.HttpServlet;

@Controller
public class AppController {

	@Autowired
	private AccountDAO accountDAO;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/admin/login")
	public String loginPage() {
		return "login";
	}
	
	
	
	@GetMapping("/product")
	public String viewProduct() {
		return "list_search_product";
	}
	
	@GetMapping("/listProduct")
	public String viewListProduct() {
		return "list_product";
	}
	
	@GetMapping("/showProductDetail")
	public String showProductDetail() {
		return "view_product_detail";
	}
	
	@GetMapping("/admin_page")
	public String adminPage() {
		return "admin_page";
	}
	
	@GetMapping("/addProdu")
	public String addProduct() {
		return "product_form";
	}
	
	@GetMapping("//user/signUp")
	public String addUser(Model model) {
		model.addAttribute("account", new Account());
		return "registration_page";
		
	}
	
	// POST: Save customer information.
	   @RequestMapping(value = { "/save_user" }, method = RequestMethod.POST)
	   public String save(HttpServlet request, //
	         Model model, //
	         @ModelAttribute("account") Account account) {
		   
		   accountDAO.save(account);
		   return "index";
	   } //
	   
	         
	         
	      }

