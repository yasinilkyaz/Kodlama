package overriding;

public class Main{

	public static void main(String[] args) {
		BaseCreditManager[] krediManagers=new BaseCreditManager[]
				{new TeacherCreditManager(),new FarmerCreditManager(),new StudentCreditManager()};

		for (BaseCreditManager baseCreditManager : krediManagers) {
			System.out.println(baseCreditManager.hesapla(1000));
			
		}
	}

}
