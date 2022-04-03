package pers.kd.udemy.spring.SpringTut1.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgoritm implements SortAlgorithm {
	
	public int[] sort(int[] numbers) {
		System.out.println("$$$$$$$$$$$$$$$$$$$$$ Quick sort algorithm");
		return numbers;
	}

}
