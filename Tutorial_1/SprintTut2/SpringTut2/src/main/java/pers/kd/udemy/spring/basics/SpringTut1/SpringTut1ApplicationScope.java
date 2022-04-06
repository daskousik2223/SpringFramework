package pers.kd.udemy.spring.basics.SpringTut1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pers.kd.udemy.spring.basics.SpringTut1.scope.PersonDAO;

@Configuration
@ComponentScan("")
public class SpringTut1ApplicationScope {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringTut1ApplicationScope.class);
	
	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(SpringTut1ApplicationScope.class);
		
		PersonDAO personDAO = appContext.getBean(PersonDAO.class);
		PersonDAO personDAO2 = appContext.getBean(PersonDAO.class);
		
		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());
		LOGGER.info("{}", personDAO2);
		LOGGER.info("{}", personDAO2.getJdbcConnection());

	}

}
