package pers.kd.udemy.spring.basics.onlnprch.processcart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pers.kd.udemy.spring.basics.SpringTut1.xml.XmlPersonDAO;

//@Configuration
//@ComponentScan
//or 
//@ComponentScan("pers.kd.udemy.spring.basics.SpringTut1.basic")
public class ProcessOnlineShopping {
	
	public static Logger LOGGER = LoggerFactory.getLogger(ProcessOnlineShopping.class);

	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgoritm());
		
		ClassPathXmlApplicationContext appContext = 
				new ClassPathXmlApplicationContext("processcart.xml");

		ProcessCart cart = appContext.getBean(ProcessCart.class);
		ProcessPayment pmnt = appContext.getBean(ProcessPayment.class);
		
		System.out.println(cart);
		System.out.println(pmnt);
		
		boolean success = pmnt.queryBank(123);
		boolean pmntsucc = false;
		boolean updateCart = false;
		if(success)
			pmntsucc = pmnt.processAmount(123, 600);
		if(pmntsucc)
			updateCart = cart.updateCart("abc");
		//System.out.println(personDao.getXmlJdbcConnection());
	}

}
