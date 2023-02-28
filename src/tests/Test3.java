package tests;

public class Test3 {
	
	static Test3 t3 = new Test3 ();
  
	public static void main(String[] args) {
		red();
		t3.blue();
		
	}
	
	
	public static void red() {
		System.out.println("This is Red");
	}
	public void blue() {
		System.out.println("This is Blue");
	}

}
