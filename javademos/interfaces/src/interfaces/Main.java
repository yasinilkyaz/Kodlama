package interfaces;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager(new MySqlCustomerDal());
		
		customerManager.add();
		CustomerManager customerManager2=new CustomerManager(new OracleCustomerDal());
		
		customerManager2.add();
	}

}
