package com.cg.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cg.spring.entity.Product;
import com.cg.spring.service.ProductService;

@RestController
public class Controller {

	@Autowired
	ProductService productService;

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public List<Product> getAllProduct() {
		return productService.retrieve();
	}

	@RequestMapping("/addproduct")
	public ModelAndView addproduct(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("addproduct");
		request.setAttribute("mode", "MODE_ADD");
		return mav;
	}

	@PostMapping("/save-product")
	public ModelAndView saveproduct(@ModelAttribute Product product, BindingResult bindingResult,
			HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("addproduct");
		productService.save(product);

		return mav;
	}

}
