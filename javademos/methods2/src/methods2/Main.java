package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj="Bugün hava çok güzel.";
		String yeniMesaj=sehirVer();
		System.out.println(yeniMesaj);
		int sayi=topla(2,7);
		System.out.println(sayi);
		
		int toplam=topla2(2,3,4,5,6);
		System.out.println(toplam);
	}

	private static int topla(int i, int j) {
		int result=i+j;
		return result;
	}

	private static String sehirVer() {
		
		return "Ankara";
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}
	public static void sil() {
		System.out.println("Silindi");
	}
	public static void guncelle() {
		System.out.println("güncellendi");
	}
	private static int topla2(int... sayilar) {
		int toplam=0;
		for(int sayi:sayilar) {
			toplam=sayi+toplam;
		}
		
		return toplam;
	}
}
