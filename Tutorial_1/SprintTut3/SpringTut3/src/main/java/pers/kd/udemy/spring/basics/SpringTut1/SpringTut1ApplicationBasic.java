package pers.kd.udemy.spring.basics.SpringTut1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pers.kd.udemy.spring.basics.SpringTut1.basic.BinarySearchImpl;

@Configuration
@ComponentScan
//or 
//@ComponentScan("pers.kd.udemy.spring.basics.SpringTut1.basic")
public class SpringTut1ApplicationBasic {
	
	public static Logger LOGGER = LoggerFactory.getLogger(SpringTut1ApplicationBasic.class);

	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgoritm());
		
		ApplicationContext appContext = 
				new AnnotationConfigApplicationContext(SpringTut1ApplicationBasic.class);

		BinarySearchImpl binarySearch = appContext.getBean(BinarySearchImpl.class);
		
		int result = binarySearch.binarySearch(new int[] {1,2,3}, 3);
		
		LOGGER.info("&&&&&&&&&&&& {}", result);
		LOGGER.info("{}", binarySearch);

	}

}
