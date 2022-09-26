package findPrimeNumberinJava;

public class Main {

	public static void main(String[] args) {
		int number = -1;
		// % kalan operatörü (mod)
		// int remainder = number % 2;
		// System.out.println(remainder); = 1
		boolean isPrime = true;
		if (number < 2) {
			isPrime = false;
		}
		if (number <1) {
			System.out.println("Geçersiz sayı");
			return;
		}
		
		
		for (int i = 1; i < number; i++) {
			
			
			
			if (number % i == 0) {
				isPrime = false;
			}
			
		}
		if (isPrime) {
			System.out.println(number + " sayısı asaldır.");
		} else {
			System.out.println(number + " sayısı asal değildir.");
		}
	}
}