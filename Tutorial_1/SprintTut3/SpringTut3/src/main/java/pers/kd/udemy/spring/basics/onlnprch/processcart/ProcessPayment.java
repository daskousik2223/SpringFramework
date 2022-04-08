package pers.kd.udemy.spring.basics.onlnprch.processcart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProcessPayment {
	
	public Logger LOGGER = LoggerFactory.getLogger(ProcessCart.class);
	
	public boolean queryBank(int acctNumber) {
		if(acctNumber <= 0)
		{
			System.out.println("########## Invalid Account Number" + acctNumber);
			return false;
		}
		return true;
	}

	public boolean processAmount(int acctNumber, double amt) {
		if(acctNumber <= 0)
		{
			System.out.println("########## Invalid Account Number" + acctNumber);
			return false;
		} else if(amt <= 0) {
			System.out.println("########## Invalid Amount " + amt);
			return false;
		}
		return true;
	}
}
