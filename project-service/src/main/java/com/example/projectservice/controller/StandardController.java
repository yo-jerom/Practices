package com.example.projectservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectservice.model.ProjectViewModel;
import com.example.projectservice.model.Standardrate;
import com.example.projectservice.service.BillingService;

@RestController
public class StandardController {
	
	@Autowired
	BillingService billingService;
	
	@PostMapping("/bills")
	public ResponseEntity<Standardrate> createBill(@RequestBody Standardrate bill) {
		billingService.saveBill(bill);

		return new ResponseEntity<Standardrate>(bill, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/bills/{sMonth}", method = RequestMethod.GET)
    public List<ProjectViewModel> fetchMonthlyDetails(@PathVariable int sMonth) {
        return billingService.fetchMonthlyDetails(sMonth);
    }
	
}
