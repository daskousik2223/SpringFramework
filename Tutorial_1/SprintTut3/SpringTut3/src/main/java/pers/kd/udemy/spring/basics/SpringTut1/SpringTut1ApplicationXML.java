package pers.kd.udemy.spring.basics.SpringTut1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pers.kd.udemy.spring.basics.SpringTut1.xml.XmlPersonDAO;

@Configuration
@ComponentScan
//or 
//@ComponentScan("pers.kd.udemy.spring.basics.SpringTut1.basic")
public class SpringTut1ApplicationXML {
	
	public static Logger LOGGER = LoggerFactory.getLogger(SpringTut1ApplicationXML.class);

	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgoritm());
		
		ClassPathXmlApplicationContext appContext = 
				new ClassPathXmlApplicationContext("applicationcontext.xml");

		XmlPersonDAO personDao = appContext.getBean(XmlPersonDAO.class);
		
		System.out.println(personDao);
		System.out.println(personDao.getXmlJdbcConnection());
		LOGGER.info("{]", (Object)appContext.getBeanDefinitionNames());
	}

}
