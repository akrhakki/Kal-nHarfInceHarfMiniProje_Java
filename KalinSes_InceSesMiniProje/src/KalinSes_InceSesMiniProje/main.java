package KalinSes_InceSesMiniProje;

public class main {

	public static void main(String[] args) {
		char GirilenDeger = 'A';
		char[] InceHarf = new char[8];
		InceHarf[0] = 'e';
		InceHarf[1] = 'i';
		InceHarf[2] = 'ö';
		InceHarf[3] = 'ü';
		InceHarf[4] = 'E';
		InceHarf[5] = 'İ';
		InceHarf[6] = 'Ö';
		InceHarf[7] = 'Ü';
		char[] KalınHarf = new char[8];
		KalınHarf[0] = 'a';
		KalınHarf[1] = 'ı';
		KalınHarf[2] = 'o';
		KalınHarf[3] = 'u';
		KalınHarf[4] = 'A';
		KalınHarf[5] = 'I';
		KalınHarf[6] = 'O';
		KalınHarf[7] = 'U';
		boolean a = false;
		for (int i = 0; i < 8; i++) {
			if (GirilenDeger == InceHarf[i]) {
				a = true;
				System.out.println("İnce Harf!!");
			} else if (GirilenDeger == KalınHarf[i]) {
				a = true;
				System.out.println("Kalın Harf!!");
			}
		}
		if (a==false) {
			System.out.println("Sesli Harf Giriniz");
			
		}

	}

}
