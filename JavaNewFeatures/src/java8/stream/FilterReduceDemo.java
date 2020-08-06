package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterReduceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(2,3,5,18,15, 76, 80);
		
		//Traditional Approach - imperative coding which focuses on both what to do and how to do
		int result=0;
		for(Integer i: list) {
			if(i%5==0) {
				result=result+i;
			}
		}
		System.out.println(result);
		
		
		// With Stream API - focus more on what to do
		System.out.println(list.stream().filter(i -> i%5==0).reduce(0,(c,e)->c+e));
		
		
//		Predicate<Integer> predicate = new Predicate<Integer>() {
//			@Override
//			public boolean test(Integer t) {
//				// TODO Auto-generated method stub
//				return t%5==0;
//			}
//		};
//		
//		System.out.println(list.stream().filter(predicate).reduce(0,(c,e)->c+e));
		
	}

}
