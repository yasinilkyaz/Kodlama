package youtubeEgitim;

public class CustomerManager {
	
	private Customer customer;
	private CreditService creditService;
	
	
	
public CustomerManager(Customer customer,CreditService creditService) {
		super();
		this.customer = customer;
		this.creditService=creditService;
	}




public void save() {
	
	System.out.println("müşteri eklendi : "+customer.getId());
}

public void delete() {
	
	System.out.println("müşteri silindi : ");
}

public void giveCredit() {
	creditService.calculate();
	creditService.save();
}
}
