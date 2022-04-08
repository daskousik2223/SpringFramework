package pers.kd.udemy.spring.basics.SpringTut1.basic;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import pers.kd.udemy.spring.basics.SpringTut1.SpringTut1ApplicationBasic;

//Todo - Load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(classes=SpringTut1ApplicationBasic.class)
public class BinarySearchImplTest {

	//Todo - Get this bean from the context
	@Autowired
	BinarySearchImpl binarySearchImpl;
	
	@Test
	public void testBasicScenario() {
		//Todo - call method on binarysearchImpl
		int result = binarySearchImpl.binarySearch(new int[] {}, 5);
		//Todo - check if the vlue is correct
		assertEquals(5, result);
	}

}
