package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
	
	String[] randomArray = new String[] {"Lucky 1", "Lucky 2", "Lucky 3"};
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int idx = rd.nextInt(randomArray.length);
		return randomArray[idx];
	}
}

