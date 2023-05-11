package com.mightyblaze.springframep.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class PacManGame implements GamingConsole {
	
	public void up() {
		System.out.println("Jump");
	}
	
	public void down() {
		System.out.println("Down");
	}
	public void left() {
		System.out.println("Left");
	}
	public void right() {
		System.out.println("Right");
	}
}
