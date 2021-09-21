package com.gmall;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext act = new ClassPathXmlApplicationContext("provider.xml");
		
		act.start();
		
		System.in.read();
	}
}
