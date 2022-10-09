package IkıncıHaftaOdev;

public class classessWithAttributes {

	public static void main(String[] args) 
	{
		Product product = new Product(1,"laptop", "Asus Laptop", 3000, 2, "Siyah");  //constructor dan set edildi
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
		
		
		

	}

}
