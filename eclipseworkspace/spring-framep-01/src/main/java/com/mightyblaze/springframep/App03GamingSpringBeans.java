package com.mightyblaze.springframep;

import javax.swing.text.AbstractDocument.Content;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mightyblaze.springframep.game.GameRunner;
import com.mightyblaze.springframep.game.GamingConfig;
import com.mightyblaze.springframep.game.GamingConsole;
import com.mightyblaze.springframep.game.MarioGame;
import com.mightyblaze.springframep.game.PacManGame;
import com.mightyblaze.springframep.game.SuperContraGame;



public class App03GamingSpringBeans {

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(GamingConfig.class)){
		context.getBean(GamingConsole.class).up();
		context.getBean(GameRunner.class).run();
		
		}
		
		 
		 
	}

}
