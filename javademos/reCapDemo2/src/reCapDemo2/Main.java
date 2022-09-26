package reCapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList= {1.2,2.3,4.5,6.7};
		double total=0;
		double max=myList[0];
	
		for(double number:myList) {
			System.out.println(number);
			if(number>max) {
				max=number;
			}
			total=total+number;
		}
		
		System.out.println("Toplam : "+total);
		System.out.println("En Büyük : "+max);
	
	}

	}


