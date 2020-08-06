package java8.interfaces;

interface i3{
	default void show() {
		System.out.println("inside i1");
	}
	
	
//	default boolean equals(Object o) {
//		return true;
//	}
}

interface i4{
	default void show() {
		System.out.println("inside i2");
	}
}

abstract class B{
	public void show() {
		System.out.println("inside abstract");
	}
}

class ABC extends B implements i3,i4{
	
}

public class DemoInterfaceAndAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABC obj = new ABC();
		obj.show();
	}

}
