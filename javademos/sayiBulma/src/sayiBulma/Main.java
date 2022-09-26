package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,7,9};
		
		int aranacak=5;
		
		/*for(int sayi:sayilar) {
			if(sayi==aranacak)System.out.println("sayı mevcut");
			 
		}*/

		boolean varMi=false;
		
		for(int sayi:sayilar) {
			if(sayi==aranacak) {
				varMi=true;
			break;}
		}
		
		if(varMi)
		{System.out.println("sayı mevcut");}
		else {
			System.out.println("sayı mevcut değil");
		}
	}

}
