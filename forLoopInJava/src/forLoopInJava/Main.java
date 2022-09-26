package forLoopInJava;

public class Main {

	public static void main(String[] args) {
		//Basic for loop
		for (int i = 1; i < 10; i++) {
		
		System.out.println(i);
		
		}
		System.out.println("Loop is over");
		
		//for loop for odd numbers
		
		for (int i=1; i<10; i+=2) {
			System.out.println(i);
		}
		System.out.println("Odd numbers are printed");
		
		for (int i = 0; i < 10; i+=2) {
			System.out.println(i);
			
		}
		System.out.println("Even Numbers Printed from zero to 8");
	}

}
