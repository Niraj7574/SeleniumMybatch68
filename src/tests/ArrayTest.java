package tests;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String tool = "Selenium1";
		//System.out.println(tool);
		
		String tools[] = {"Selenium","Junit","UnitTest","Git"};
		//System.out.println(tools.length);
		
		for(int i=0; i<tools.length; i++) {
			System.out.println(tools[i]);
		}
		System.out.println("---------------");
		
		int numbers[] = {1,23,51,60,100};
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		System.out.println("---------------");
		Object mix[] = {"Junit", 10, 22.5};
		for(int i=0; i<mix.length; i++) {
			System.out.println(mix[i]);
		}
		
				 
	}

}
