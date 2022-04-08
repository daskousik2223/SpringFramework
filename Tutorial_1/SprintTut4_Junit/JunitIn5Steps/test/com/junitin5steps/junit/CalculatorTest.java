package com.junitin5steps.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void sum_with3numbers() {
		
		Calculator myMath = new Calculator();
		int result = myMath.sum(new int[] {1,2,3});
		
		assertEquals(6, result);
		
		System.out.println(result);
		
	}
	
	@Test
	void sum_with4numbers() {
		
		Calculator myMath = new Calculator();
		int result = myMath.sum(new int[] {1,2,3,4});
		
		assertEquals(10, result);
		
		System.out.println(result);
		
	}
	
	@Test
	void sum_with2numbers() {
		
		Calculator myMath = new Calculator();
		int result = myMath.sum(new int[] {1,2});
		
		assertEquals(3, result);
		
		System.out.println(result);
		
	}

}
