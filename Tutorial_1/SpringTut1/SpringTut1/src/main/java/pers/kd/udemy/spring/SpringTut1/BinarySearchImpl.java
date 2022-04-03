package pers.kd.udemy.spring.SpringTut1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}

	public int binarySearch(int [] numbers, int number) {
		
		int sortedNumbers[] = sortAlgorithm.sort(numbers);
		
		System.out.println("################### Sort algoritm is : " + sortAlgorithm);
		return 3;
	}

}
