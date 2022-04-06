package pers.kd.udemy.spring.basics.SpringTut1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pers.kd.udemy.spring.basics.SpringTut1.cdi.CDIExample;

@Configuration
@ComponentScan("pers.kd.udemy.spring.basics.SpringTut1.cdi")
public class SpringTut1ApplicationCDI {
	
	public static Logger LOGGER = LoggerFactory.getLogger(SpringTut1ApplicationCDI.class);

	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgoritm());
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(SpringTut1ApplicationCDI.class);
		CDIExample cdiExample = appContext.getBean(CDIExample.class);
		
		cdiExample.getCdiExampleDAO();
		
		LOGGER.info("{}",cdiExample);
		LOGGER.info("dao - {}",cdiExample.getCdiExampleDAO());
		

	}

}
