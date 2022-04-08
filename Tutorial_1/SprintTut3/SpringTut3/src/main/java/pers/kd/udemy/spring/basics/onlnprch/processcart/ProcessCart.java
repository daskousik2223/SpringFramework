package pers.kd.udemy.spring.basics.onlnprch.processcart;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ProcessCart //implements ProcessPayment
{

	public Logger LOGGER = LoggerFactory.getLogger(ProcessCart.class);
	
	public boolean updateCart(String userId) {
		
		ArrayList items = getCartItems(userId);
		
		System.out.println("########## Cart size " + items.size() + " for user " + userId);
		
		int updatedCartCount = removeCartItems(items);

		System.out.println("########## Updated Cart size " + updatedCartCount);
		if(updatedCartCount == 0)
		return true;
		else
			return false;
	}

	private int removeCartItems(ArrayList items) {
		items.removeAll(items);
		return items.size();
	}

	private ArrayList getCartItems(String id) {
		ArrayList cartItems = new ArrayList();
		cartItems.add("Cloth");
		cartItems.add("Electronics");
		cartItems.add("Food");
		return cartItems;
	}
	
	

}
