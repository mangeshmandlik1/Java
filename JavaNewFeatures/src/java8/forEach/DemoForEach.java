package java8.forEach;

import java.util.ArrayList;
import java.util.List;

public class DemoForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> numbers = new ArrayList<>();
		for(int i=0; i<10; i++) {
			numbers.add(i);
		}
		
		//Traditional Loop
		for(Integer i : numbers) {
			System.out.println("Elements in Sequence: "+i);
		}
		
		//forEach : inspired by Functional Programming is to express what to do instead of how to do it
		// cannot use flow controls like continue, break, return
		numbers.parallelStream().forEach(i -> System.out.println("Elements in parallel: "+i));
		
		
		
	}

}
