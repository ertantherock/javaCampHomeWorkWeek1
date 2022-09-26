package reCapDemo2;
//This file includes Array with For Each loop. Finding min and max number in an array with For loop.
public class Main {

	public static void main(String[] args) {
		double[] myList = new double[5]; // Arrayin kaç karakterli olduğunu belirtmen gerekiyor.

		double[] myList2 = { 1.8, 1.2, 2.8, 5.5 };
		double total = 1.0;
		double max = myList2[0];
		double min = myList2[0];

		for (double numberDouble : myList2) {
			if (max < numberDouble) {

				max = numberDouble;
			}
			
			if (min > numberDouble) {
				min = numberDouble;
				
			}	
			
			total = total + numberDouble;
			// numberDouble takma isim ve for each döngüsünde kendimiz belirleriz.
			System.out.println(numberDouble);
		}
		System.out.println("Total of myList2 Array = " + total);
		System.out.println("En Büyük Sayı = " + max);
		System.out.println("En Küçük Sayı = " + min);


	}

}
