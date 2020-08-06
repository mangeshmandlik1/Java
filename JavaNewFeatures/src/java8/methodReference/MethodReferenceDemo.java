package java8.methodReference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		
		//list.forEach(i-> System.out.println(i)); //when we are going to process all elements, why should we specify i separately
		
		list.forEach(System.out :: println);
		list.forEach(MethodReferenceDemo :: doubleIt);
		
	
	}
	
	public static void doubleIt(Integer i) {
		System.out.println(i*2);
	}

}
