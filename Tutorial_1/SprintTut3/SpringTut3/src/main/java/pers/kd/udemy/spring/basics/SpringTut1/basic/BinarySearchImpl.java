package pers.kd.udemy.spring.basics.SpringTut1.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	@Qualifier("quick")
	private SortAlgorithm sortAlgorithm;
	
	//Constructor autowiring
	/*
	 * public BinarySearchImpl(SortAlgorithm sortAlgorithm) { super();
	 * this.sortAlgorithm = sortAlgorithm; }
	 */
	
	//Setter autowiring. Even if the setter method is not defined, autowiring by setter is invoked.
	/*
	 * public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
	 * this.sortAlgorithm = sortAlgorithm; }
	 */
	

	public int binarySearch(int [] numbers, int number) {
		
		int sortedNumbers[] = sortAlgorithm.sort(numbers);
		
		System.out.println("################### Sort algoritm is : " + sortAlgorithm);
		return 3;
		
	}



}
