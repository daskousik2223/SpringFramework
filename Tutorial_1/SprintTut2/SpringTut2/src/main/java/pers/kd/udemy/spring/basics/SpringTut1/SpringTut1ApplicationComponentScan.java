package pers.kd.udemy.spring.basics.SpringTut1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import pers.kd.udemy.spring.basics.SpringTut1.scope.PersonDAO;
import pers.kd.udemy.spring.componentscan.ComponentDAO;

@SpringBootApplication
@ComponentScan("pers.kd.udemy.spring.componentscan")
public class SpringTut1ApplicationComponentScan {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringTut1ApplicationComponentScan.class);
	
	public static void main(String[] args) {
		
		ApplicationContext appContext = SpringApplication.run(SpringTut1ApplicationComponentScan.class, args);
		
		ComponentDAO componentDAO = appContext.getBean(ComponentDAO.class);
		
		LOGGER.info("{}", componentDAO);
		LOGGER.info("{}", componentDAO.getJdbcConnection());


	}

}
