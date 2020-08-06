package java8.lambda;

interface i1{
	void show();
	
//	void showNumber(int num);
}

//class ABC implements i1{
//
//	@Override
//	public void show() {
//		System.out.println("Inside show");
//	}
//	
//}

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		i1 obj;
		// ----- 3 classes will be created
//		obj = new ABC();
//		obj.show();
		
		
		
		//-----3 classes will be created 
//		obj = new i1(){
//			@Override
//			public void show() {
//				System.out.println("Inside show");
//			}
//		};
//		obj.show();
		
		
		// ----- 2 classes will be created
		obj = () -> System.out.println("Inside show");
		obj.show();
		
//		obj = (num) -> System.out.println("Inside show"+num);
//		obj.showNumber(6);
		
		
	}

}
