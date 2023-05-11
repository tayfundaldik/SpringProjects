package com.mightyblaze.springframep.examples.a0;

import java.util.Arrays;

import javax.swing.text.AbstractDocument.Content;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Bean;



//@Component
@Service
public class BusinessCalculationService {
	private DataService dataService;
	public BusinessCalculationService(DataService dataService) {
		super();
		this.dataService = dataService;
	}
	
	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}
}
 