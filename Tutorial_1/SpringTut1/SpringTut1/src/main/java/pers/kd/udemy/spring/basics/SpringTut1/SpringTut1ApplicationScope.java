package pers.kd.udemy.spring.basics.SpringTut1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import pers.kd.udemy.spring.basics.SpringTut1.scope.PersonDAO;

@SpringBootApplication
public class SpringTut1ApplicationScope {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringTut1ApplicationScope.class);
	
	public static void main(String[] args) {
		
		ApplicationContext appContext = SpringApplication.run(SpringTut1ApplicationScope.class, args);
		
		PersonDAO personDAO = appContext.getBean(PersonDAO.class);
		PersonDAO personDAO2 = appContext.getBean(PersonDAO.class);
		
		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());
		LOGGER.info("{}", personDAO2);
		LOGGER.info("{}", personDAO2.getJdbcConnection());

	}

}
