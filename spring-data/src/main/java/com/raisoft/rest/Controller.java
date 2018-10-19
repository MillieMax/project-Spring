package com.raisoft.rest;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/hello")
	public ResponseEntity<String> hello(){
		return new ResponseEntity<String>("Hello Sanjeev. Your session Token is "+UUID.randomUUID().toString(), HttpStatus.OK);
	}
}
