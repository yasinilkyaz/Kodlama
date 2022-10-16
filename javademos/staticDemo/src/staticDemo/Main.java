package staticDemo;

public class Main {

	public static void main(String[] args) {


		ProductManager manager=new ProductManager();
		Product product= new Product();
		product.name="fare";
		product.price=0;
		manager.add(product);
		
		ProductValidator productValidator=new ProductValidator();
		productValidator.baskaMethod();
		
		//Engin hoca önermiyor Single responsibility iki ayrı class oluşturmak daha mantıklı
		DatabaseHelper.Crud.create();
		DatabaseHelper.Connection.createConnection();
	}

}
