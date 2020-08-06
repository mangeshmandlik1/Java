package java8.interfaces;

interface i{
	static void show() {
		System.out.println("inside static block");
	}
}

public class DemoInterfaceStaticMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		i.show();
	}

}
