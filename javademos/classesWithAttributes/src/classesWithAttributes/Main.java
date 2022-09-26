package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product=new Product(1,"Laptop","MSI Laptop", 15000, 6, "siyah");
		/*product.setId(0);
		product.setName("Laptop");
		product.setDescription("MSI Laptop");
		product.setPrice(10000);
		product.setStockAmount(5);*/
		Product product2=new Product();
		
		ProductManager productManager=new ProductManager();
		
		productManager.add(product);
		System.out.println(product.getKod());
	}

}
