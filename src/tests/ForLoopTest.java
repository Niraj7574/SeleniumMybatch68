package tests;

public class ForLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
				if(i==5) {
					System.out.println("Got 5");
					break;
				}
		}
	}

}


