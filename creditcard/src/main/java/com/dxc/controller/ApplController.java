package com.dxc.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.dxc.model.Application;
import com.dxc.exception.ApplExistsException;
import com.dxc.dao.ApplDAO;
import com.dxc.service.ApplService;

@RestController
@RequestMapping("/creditcard")
public class ApplController {
	
	@GetMapping("/greet")
    public String welcome(){
        return "Credit card page is working";
    }
	
	@Autowired
	private ApplService applservice;

	
	@PostMapping("/apply")
	public ResponseEntity<?> apply(@RequestBody Application appl) throws ApplExistsException{
		return new ResponseEntity<>(applservice.apply(appl),HttpStatus.CREATED);
	}
	
	@GetMapping("/apply/{applid}")
	public List<Application> getApplById(@PathVariable int applid){
		return applservice.getAllApplicationById(applid);
	}
	
	@PutMapping("/apply")
	public void updateApplication(@RequestBody Application appl) {
		applservice.updateApplicationById(appl);
	}
	
	 @DeleteMapping("/apply/{applid}")
     public void deleteApplication(@PathVariable int applid){
	 		applservice.deleteApplicationById(applid);
  }


}
