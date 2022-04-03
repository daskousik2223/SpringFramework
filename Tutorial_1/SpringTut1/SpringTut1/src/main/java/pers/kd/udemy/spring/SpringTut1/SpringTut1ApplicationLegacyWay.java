package pers.kd.udemy.spring.SpringTut1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringTut1ApplicationLegacyWay {

	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgoritm());
		
		ApplicationContext appContext = SpringApplication.run(SpringTut1ApplicationLegacyWay.class, args);
		BinarySearchImpl binarySearch = appContext.getBean(BinarySearchImpl.class);
		
		int result = binarySearch.binarySearch(new int[] {1,2,3}, 3);
		System.out.println("Result is ################  : " + result);

	}

}
