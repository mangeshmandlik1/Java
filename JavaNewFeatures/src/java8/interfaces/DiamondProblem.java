package java8.interfaces;

interface i1 {
	default void show() {
		System.out.println("inside i1");
	}
}

interface i2 {
	default void show() {
		System.out.println("inside i2");
	}
}

class A implements i1, i2 {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		i2.super.show();
	}

}

public class DiamondProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		obj.show();
	}

}
