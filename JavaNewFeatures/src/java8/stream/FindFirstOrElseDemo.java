package java8.stream;

import java.util.Arrays;
import java.util.List;

public class FindFirstOrElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = Arrays.asList(2,3,5,18,15, 76, 80);
		List<Integer> list2 = Arrays.asList(2,3,1,18,12, 76, 82);

		
		System.out.println(list1.stream().filter(i -> i%5==0).findFirst());
		
		System.out.println(list2.stream().filter(i -> i%5==0).findFirst());
		System.out.println(list2.stream().filter(i -> i%5==0).findFirst().orElse(0));
		
		
		
		
		//Lazy Evaluation and Terminal Function
//		System.out.println(list1.stream().filter(FindFirstOrElseDemo :: isDivisible)
//					.map(FindFirstOrElseDemo::mapDouble)
//					.findFirst()
//					.orElse(0));
//		
//		int result=0;
//		for(int i=0; i<list1.size();i++) {
//			if(i%5==0) {
//				result=i*2;
//				break;
//			}
//		}
//		System.out.println("Result: "+result);
		
	}
	
	public static boolean isDivisible(int i) {
		
		System.out.println("in Div: "+i);
		return i%5==0;
	}
	
	public static int mapDouble(int i) {
		
		System.out.println("in MapDouble: "+i);
		return i*2;
	}
	
	

}
