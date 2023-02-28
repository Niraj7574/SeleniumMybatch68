package tests;

public class ArgumentsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum();
		sum(6, 7);
	

	}
	
	public static void sum() {
		int a = 4+9;
		System.out.println(a);
	}
	
	public static void sum(int b, int c) {
		int a = b+c;
		System.out.println(a);
	}
	public static void sum(int b, int c, int d) {
		int a = b+c+d;
		System.out.println(a);
	}

}
