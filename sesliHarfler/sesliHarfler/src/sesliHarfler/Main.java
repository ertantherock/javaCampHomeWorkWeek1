package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		String harf = "İ";
		
		if (harf == "A" || harf =="O" || harf =="I" || harf == "U" || harf == "a" || harf =="o" || harf =="ı" || harf == "u") {
			
			System.out.println(harf + " Kalın Sesli Harftir");
		} else if (harf == "E" || harf =="İ" || harf =="Ö" || harf == "Ü" || harf == "e" || harf =="i" || harf =="o" || harf == "ö") {
			
			System.out.println(harf + " İnce Sesli Harftir");
		} else {
			System.out.println(harf + " Sessiz bir harftir.");
		}

	}

}
