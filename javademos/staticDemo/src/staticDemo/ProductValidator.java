package staticDemo;



public class ProductValidator {
	
	static {
		System.out.println("statik yapıcı blok çalıştı");
	}

	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı");
	}
	public static boolean isValid(Product product){
		if (product.price>0 &&!product.name.isEmpty()) {
			return true;
			
		}else {
			return false;
		}
	}
	
	public void baskaMethod() {
		
	}
	
	public class innerClass{
		public static void sil() {
			System.out.println("İnner class");
		}
	}
}
