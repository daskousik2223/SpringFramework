package com.junitin5steps.junit;

public class Calculator {
	
	int sum(int[] numbers) {
		int sum = 0;
		for(int i : numbers) {
			sum += i;
		}
		return sum;
	}

}
