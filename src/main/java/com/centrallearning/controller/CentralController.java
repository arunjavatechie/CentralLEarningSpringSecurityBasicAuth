package com.centrallearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.centrallearning.delegate.CentralDelegate;
import com.centrallearning.model.Employee;

@RestController
@RequestMapping("/api/learning")
public class CentralController {

	@Autowired
	CentralDelegate centralDelegate;

	@GetMapping
	public String getM(@RequestParam("name") String name) {
		return "Welcome to get mapping , " + centralDelegate.getName(name);
	}

	@PostMapping
	public String postM(@RequestBody Employee employee) {
		return "Welcome to POST mapping" + centralDelegate.getEmployee(employee);
	}

	@PutMapping
	public String putM(@RequestParam("name") String name) {
		return "Welcome to PUT mapping" + centralDelegate.getName(name);
	}

	@DeleteMapping
	public String deleteM(@RequestParam("name") String name) {
		return "Welcome to DELETE mapping" + centralDelegate.getName(name);
	}

}
