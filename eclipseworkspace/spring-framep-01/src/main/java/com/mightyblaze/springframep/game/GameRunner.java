package com.mightyblaze.springframep.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameRunner {
	private GamingConsole game;
	public GameRunner(GamingConsole game) {
		this.game = game;
	}
	
	public void run() {
		System.out.println("Running game: "+ game);
		game.up();
		game.down();
		game.left();
		game.right();
		
	}
}
