package pers.kd.udemy.spring.basics.SpringTut1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import pers.kd.udemy.spring.basics.SpringTut1.basic.BinarySearchImpl;

@SpringBootApplication
public class SpringTut1ApplicationBasic {

	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgoritm());
		
		ApplicationContext appContext = SpringApplication.run(SpringTut1ApplicationBasic.class, args);
		BinarySearchImpl binarySearch = appContext.getBean(BinarySearchImpl.class);
		
		int result = binarySearch.binarySearch(new int[] {1,2,3}, 3);
		System.out.println("Result is ################  : " + result);

	}

}
