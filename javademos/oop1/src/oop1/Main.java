package oop1;

public class Main {

	public static void main(String[] args) {

		String mesaj = "vade oranı";

		Product product1 = new Product();
		// set
		product1.setName("Delonghi kahve makinesi");
		product1.setDiscount(5);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(5);
		product1.setImageUrl("bilmemne1.jpg");

		// get
		// System.out.println(product1.name);

		
		Product product2 = new Product();
		product2.setName("Smeg kahve makinesi");
		product2.setDiscount(5);
		product2.setUnitPrice(6500);
		product2.setUnitsInStock(5);
		product2.setImageUrl("bilmemne2.jpg");


		Product product3 = new Product();
		product3.setName("Arzum kahve makinesi");
		product3.setDiscount(5);
		product3.setUnitPrice(4500);
		product3.setUnitsInStock(5);
		product3.setImageUrl("bilmemne3.jpg");

		
		Product[] products= {product1,product2,product3};
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>"+product.getName()+"</li>");
		}
		System.out.println("</ul>");
		
		
		IndividualCustomer individualCustomer=new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhoneNumber("50554645646");
		individualCustomer.setCustomerNumber("632152");
		individualCustomer.setFirstName("Engin");
		individualCustomer.setLastName("demiroğ");
		
		
		CorporateCustomer corporateCustomer=new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setPhoneNumber("654232156465");
		corporateCustomer.setCustomerNumber("1234567890");
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setTaxNumber("3216546231");
		
		Customer[] customers= {individualCustomer,corporateCustomer};
		
	}

}
