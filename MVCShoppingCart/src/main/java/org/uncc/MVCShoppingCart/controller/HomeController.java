package org.uncc.MVCShoppingCart.controller;

import dao.ProductDAO;
import org.uncc.MVCShoppingCart.config.Product;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;


public class HomeController {
	@Autowired
	private ProductDAO productDAO;
	
	@RequestMapping(value="/Products")
	public ModelAndView listProduct(ModelAndView model) throws IOException {
		List<Product> listProduct = productDAO.list();
		model.addObject("listProduct", listProduct);
		model.setViewName("home");
		
		return model;
	}
	
	@RequestMapping(value="/addProduct", method = RequestMethod.GET)
	public ModelAndView newProduct(ModelAndView model) {
		Product newProduct = new Product();
		model.addObject("product", newProduct);
		model.setViewName("AddProduct");
		return model;
	}
	
	@RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
	public ModelAndView saveProduct(@ModelAttribute Product product) {
		productDAO.saveOrUpdate(product);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value = "/deleteProduct", method = RequestMethod.GET) 
		public ModelAndView deleteProduct(HttpServletRequest request) {
			int productId = Integer.parseInt(request.getParameter("id"));
			productDAO.delete(productId);
			return new ModelAndView("redirect:/");
		}
	
	@RequestMapping(value = "/editProduct", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int productId = Integer.parseInt(request.getParameter("id"));
		Product product = productDAO.get(productId);
		ModelAndView model = new ModelAndView("EditProduct");
		model.addObject("product", product);
		
		return model;
	}
}
