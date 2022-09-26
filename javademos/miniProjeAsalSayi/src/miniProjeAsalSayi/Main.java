package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number=-1;
		
		int kontrol=0;
		
		/*for(int i=2;i<number;i++) {
			
			kontrol=number%i;
		}
		
		if(kontrol==0) {
			System.out.println("Sayı asal değildir = "+number);
		}else {
			System.out.println("Sayı asaldır = "+number);
		}*/
		
		boolean asalMi=true;
		if(number==1) {
			System.out.println("Sayı asal değildir = "+number);
			return;
		}
		if(number<1) {
			System.out.println("Geçersiz sayı = "+number);
			return;
		}
		
		for(int i=2;i<number;i++) {
			if(number % i==0) {
				asalMi=false;
			}
		}
		
		if(asalMi) {
			System.out.println("Sayı asaldır = "+number);
		}else {
			System.out.println("Sayı asal değildir = "+number);
		}

	}

}
