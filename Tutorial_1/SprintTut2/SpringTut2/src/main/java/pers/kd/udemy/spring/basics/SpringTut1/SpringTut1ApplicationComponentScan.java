package pers.kd.udemy.spring.basics.SpringTut1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pers.kd.udemy.spring.componentscan.ComponentDAO;

@Configuration
@ComponentScan("pers.kd.udemy.spring.componentscan")
public class SpringTut1ApplicationComponentScan {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringTut1ApplicationComponentScan.class);
	
	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(SpringTut1ApplicationComponentScan.class);
		
		ComponentDAO componentDAO = appContext.getBean(ComponentDAO.class);
		
		LOGGER.info("{}", componentDAO);
		LOGGER.info("{}", componentDAO.getJdbcConnection());


	}

}
