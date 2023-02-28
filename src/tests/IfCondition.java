package tests;

public class IfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		
		if(a==b) {
			System.out.println("a and b are equal");
		}
		else {
			System.out.println("a and b are not equal");
		}
		
		String expected = "Hello World";
		String actual = "Hello world";
		if(expected.equals(actual)) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test Fail");
		}

	}

}
