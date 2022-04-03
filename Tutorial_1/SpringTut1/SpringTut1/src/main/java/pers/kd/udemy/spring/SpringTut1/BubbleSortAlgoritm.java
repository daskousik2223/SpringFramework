package pers.kd.udemy.spring.SpringTut1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgoritm implements SortAlgorithm{
	
	public int[] sort(int[] numbers) {
		return numbers;
	}

}
