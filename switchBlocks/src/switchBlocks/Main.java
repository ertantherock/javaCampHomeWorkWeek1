package switchBlocks;

public class Main {

	public static void main(String[] args) {
		char grade = 'T';

		switch (grade) {

		case 'A':
			System.out.println("Mükemmel Geçtiniz");
			break;
		case 'B':
			System.out.println("İyi Geçtiniz");
			break;
		case 'C':
			System.out.println("Normal Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef geçemediniz");
			break;
		default:
			System.out.println("Yanlış veya geçersiz not girdiniz.");
		}

	}

}
