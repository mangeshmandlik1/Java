package java8.interfaces;

interface Phone {
	void call();
	
	default void message() {
		System.out.println("Default call method");
	}
}

class Android implements Phone {

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Inside call");
	}

}

public class DemoInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Android obj = new Android();
		obj.call();
		obj.message();
	}

}
