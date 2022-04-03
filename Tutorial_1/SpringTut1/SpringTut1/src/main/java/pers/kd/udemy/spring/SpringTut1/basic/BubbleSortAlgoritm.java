package pers.kd.udemy.spring.SpringTut1.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgoritm implements SortAlgorithm{
	
	public int[] sort(int[] numbers) {
		return numbers;
	}

}
