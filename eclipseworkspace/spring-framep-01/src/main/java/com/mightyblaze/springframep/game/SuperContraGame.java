package com.mightyblaze.springframep.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SuperContraGame implements GamingConsole{
	@Bean
	public void up() {
		System.out.println("Jump");
	}
	@Bean
	public void down() {
		System.out.println("Sit down");
	}
	@Bean
	public void left() {
		System.out.println("Go back");
	}
	@Bean
	public void right() {
		System.out.println("Shoot a bullet");
	}
}
