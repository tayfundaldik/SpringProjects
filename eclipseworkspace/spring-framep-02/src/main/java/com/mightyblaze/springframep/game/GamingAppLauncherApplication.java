package com.mightyblaze.springframep.game;

import javax.swing.text.AbstractDocument.Content;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
@Configuration
@ComponentScan("com.mightyblaze.springframep.game")
public class GamingAppLauncherApplication {
	
	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)){
		context.getBean(GamingConsole.class).up();
		context.getBean(GameRunner.class).run();
		
		}
		
		 
		 
	}

}
 