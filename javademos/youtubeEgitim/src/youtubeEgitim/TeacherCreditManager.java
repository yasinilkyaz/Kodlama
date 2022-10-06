package youtubeEgitim;

public class TeacherCreditManager extends BaseCreditManager implements CreditService{

	@Override
	public void calculate() {
		System.out.println("Öğretmen kredisi hesaplandı");
		
	}

	public void save() {
		System.out.println("Kaydedildi Öğretmen");
		
	}

}
