package com.example.demo.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;

//import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.EnableIncident;
import com.example.demo.repositories.IncidentDao;

@RestController
@CrossOrigin("*")
public class IncidentController {
	
	//@Autowired
	IncidentDao dao;

	@PostMapping("/incident")
	public  String incidentForm(@RequestBody EnableIncident i) {
	dao.save(i);
	
	return ("successfully incident submitted");
	}
}
