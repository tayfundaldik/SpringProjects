package com.mightyblaze.springframep.helloworld;

import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration.AnnotationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
record Person(String name,int age,Address adres) {}
record Address(String firstLine,String city) {}
@Configuration
public class HelloWorldConfiguration {
	@Bean 
	public String name() {
		 return "Hellü";
	 }
	@Bean
	public int age() {
		return 18;
	}
	@Bean
	public Person person() {
		return new Person("John", 25,new Address("MH", "NY"));
		
	}
	@Bean
	public Person person2Meth() {
		return new Person(name(), age(),address());
		
	}
	@Bean
	public Person person3parameters(String name, int age , Address adres) {
		return new Person(name, age,adres);
		
	}
	@Bean(name = "SEA")
	public Address address() {
		return new Address("AU", "TX");
	}
}
