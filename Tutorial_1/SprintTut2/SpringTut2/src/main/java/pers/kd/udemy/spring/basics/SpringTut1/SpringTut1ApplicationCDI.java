package pers.kd.udemy.spring.basics.SpringTut1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import pers.kd.udemy.spring.basics.SpringTut1.basic.BinarySearchImpl;
import pers.kd.udemy.spring.basics.SpringTut1.cdi.CDIExample;

@SpringBootApplication
@ComponentScan("pers.kd.udemy.spring.basics.SpringTut1.cdi")
public class SpringTut1ApplicationCDI {
	
	public static Logger LOGGER = LoggerFactory.getLogger(SpringTut1ApplicationCDI.class);

	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgoritm());
		
		ApplicationContext appContext = SpringApplication.run(SpringTut1ApplicationCDI.class, args);
		CDIExample cdiExample = appContext.getBean(CDIExample.class);
		
		cdiExample.getCdiExampleDAO();
		
		LOGGER.info("{}",cdiExample);
		LOGGER.info("dao - {}",cdiExample.getCdiExampleDAO());
		

	}

}
