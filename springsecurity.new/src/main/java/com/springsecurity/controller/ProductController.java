package com.springsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import com.springsecurity.dto.AuthRequest;
import com.springsecurity.entity.Product;
import com.springsecurity.service.JwtService;
import com.springsecurity.service.ProductService;

@RestController
@RequestMapping("/products")
//@PreAuthorize("hasAuthority('ROLE_ADMIN')")
public class ProductController {
	
	@Autowired
	private JwtService jwtService;
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome Page";
	}
	
	@PostMapping("/new")
	public void addNewProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}
	
	@GetMapping("/all")
	public List<Product> getAllProducts() {
		System.out.println("****** getAllProducts is called");
		return productService.getProducts();
	}
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable int id) {
		return productService.getProductById(id);
	}
	
	@PostMapping("/authenticate")
	public String authenticateAndGetToken(@RequestBody AuthRequest authRequest) {
		  Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPass()));
	        if (authentication.isAuthenticated()) {
	            return jwtService.generateToken(authRequest.getUsername());
	        } else {
	            throw new UsernameNotFoundException("invalid user request !");
	        }
	}
	
}
