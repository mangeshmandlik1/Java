package java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapReduceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(1,2,3,4,5);
		List<Long> longList = new ArrayList<>();
		
		int result=0;
		for(Integer i : list) {
			result = result + i*2;
		}
		System.out.println(result);
		
		System.out.println(list.stream().map(i->i*2).reduce(0,(i,j)->i+j));
//		System.out.println(list.stream().map(i->i*2).reduce(0,(i,j)-> Integer.sum(i, j)));
//		System.out.println(list.stream().map(i->i*2).reduce(0,Integer::sum));
		longList = list.stream().mapToLong(Integer::longValue).boxed().collect(Collectors.toList());
		System.out.println(longList);
		
		
//		Function<Integer, Integer> mapper = new Function<Integer, Integer>() {
//			@Override
//			public Integer apply(Integer t) {
//				// TODO Auto-generated method stub
//				return t*2;
//			}
//		};
//		
//		BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
//			@Override
//			public Integer apply(Integer t, Integer u) {
//				// TODO Auto-generated method stub
//				return t+u;
//			}
//		};
//		
//		System.out.println(list.stream().map(mapper).reduce(0, binaryOperator));
		
		
		
		
	}
	

}
