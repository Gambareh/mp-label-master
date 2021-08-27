package com.maplesoft.ms.main.controllers;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.maplesoft.ms.main.persistance.dto.ProductDto;
import com.maplesoft.ms.main.persistance.models.Product;
import com.maplesoft.ms.main.services.ProductService;


@RestController
@RequestMapping("/lb/product")
public class ProductController {
	
	private ProductService service;
	private ModelMapper modelMapper;
	
	@Autowired
	public ProductController(ProductService service,ModelMapper modelMapper) {
		this.service = service;
		this.modelMapper = modelMapper;
	}
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<ProductDto>  getAllProducts() {
		List<Product> products = service.getAllProducts();
		ProductDto productDto = modelMapper.map(products, ProductDto.class);	
		return ResponseEntity.ok(productDto);
	}
	
	@GetMapping("/id")
	@ResponseBody
	public ResponseEntity<ProductDto>  getProduct(@RequestParam String id) {
		Product product = service.getProduct(Long.valueOf(id));		
		ProductDto productDto = modelMapper.map(product, ProductDto.class);		
		return ResponseEntity.ok(productDto);
	}
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<ProductDto> saveProduct(@RequestBody ProductDto productDto) {
		Product productTmp = modelMapper.map(productDto, Product.class);
		Product product = service.saveProduct(productTmp);
		ProductDto productDtoRet = modelMapper.map(product, ProductDto.class);
		return ResponseEntity.ok(productDtoRet);
	}
	
	@DeleteMapping
	public void  deleteProduct(@RequestBody ProductDto productDto) {
		Product product = modelMapper.map(productDto, Product.class);
		service.delete(product);
	}

}
