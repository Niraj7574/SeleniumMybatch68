package tests;

import selenium.Test4;

public class Test1 {
	
	static Test1 t1 = new Test1();
	static Test2 t2 = new Test2();
	static Test3 t3 = new Test3();
	static Test4 t4 = new Test4();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am in main method");
		scanMe();
		printMe();
		t1.paintMe();
		Test2.circle();
		t2.square();
		Test3.red();
		t3.blue();
		ArgumentsTest.sum(20, 30);
		ArgumentsTest.sum(10, 20, 30);
		Test4.car();
		t4.train();		
	}
	
	public static void printMe() {
		System.out.println("This is PrintMe");
	}
	
	public static void scanMe() {
		System.out.println("This is ScanMe");
	}
	
	public void paintMe() {
		System.out.println("This is PaintMe");
	}

}
