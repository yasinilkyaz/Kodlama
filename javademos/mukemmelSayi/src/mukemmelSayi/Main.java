package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		
		int number=6;
		
		int bolunenler=0;
		
		for(int i=1;i<number;i++) {
			if(number%i==0) {
				bolunenler=bolunenler+i;
			}
		}
		
		if(number==bolunenler) {
			System.out.println(number+" mükemmel sayıdır");
		}else {
			System.out.println(number+"mükemmel sayı değildir");
		}

	}

}
