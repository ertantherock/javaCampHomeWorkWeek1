package arraysDemo1;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Ertan";
		String ogrenci2 = "Kaya";
		String ogrenci3 = "Selim";
		
		//Hepsini ayrı ayrı yazdırmak çok zor olacaktır. Ayrıca yeni öğrenci geldiğinde yeni tanım yapılması
		//ve diğer tüm işler çok fazla zaman olacaktır. O yüzden Arrayleri kullanırız.
		
		
		String[] students = new String[4];
		
		students[0] = "Ertan";
		students[1] = "Kaya";
		students[2] = "Selim";
		students[3] = "Dilara";
		
		for (int i = 0; i < students.length; i++) {
			System.out.println("öğrenci Adı: " + students[i] );
		}
		
		for (String ogrenciler: students) {
			System.out.println("öğrenci Adı: " +ogrenciler);
		}
		

	}

}
