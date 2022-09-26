package switchDemo;

public class Main {

	public static void main(String[] args) {

		char grade ='h';
		switch(grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
			
		case 'B':
			
		case 'C':
			System.out.println("Çok güzel : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Malesef kaldınız");
			break;
		default:
				System.out.println("Geçersiz kod girildi");
		}
	}

}
