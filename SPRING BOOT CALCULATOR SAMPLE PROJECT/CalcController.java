package com.example.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.calculator.service.CalcService;

@RestController
public class CalcController {
	@Autowired
	CalcService calcService;

	@GetMapping("/calc/{a}/{b}")
	public int calcDiv(@PathVariable int a, @PathVariable int b) {
		return calcService.testDiv(a, b);
	}

}
