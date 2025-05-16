package com.vk.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wish")
public class WishController {

	@GetMapping("/msg/{name}")
	public ResponseEntity<String> wishMessage(@PathVariable(name="name") String name){
		//response
		return new ResponseEntity<String>("Welcome "+name , HttpStatus.OK);
	}
}
