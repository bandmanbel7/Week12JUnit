package com.promineotech;

import java.util.Random;

public class TestDemo {

	public int addPositive(int a, int b) {
		
		int sum;
		if(a>0 && b>0) {
			sum = a+b;
		}
		
		else {
			throw new IllegalArgumentException(" Both Parameters must be positive! ");
		}
		return sum;
	}
	
	public int randomNumberedSquared() {
		int tempInt = getRandomInt();
		return tempInt*tempInt;
	}
	
	int getRandomInt() {
		Random random = new Random();
		
		return random.nextInt(10) + 1;
		
	}

	public int sub (int firstNum, int secondNum) {
		return firstNum - secondNum;
	}
	
}