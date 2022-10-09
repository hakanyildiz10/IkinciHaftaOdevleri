package IkıncıHaftaOdev;

public class Product 
{
	public Product(int id, String name, String description, double price, int StackAmount, String renk)          // parametreli constructor
	{
		System.out.println("Yapıcı blok çalıştı");
		this.id = id;
		this.renk = renk;
		this.name = name;
		this.price = price;
		this.description = description;
		this.stockAmount = stockAmount;
	}
				
	public Product()                    // parametresiz constructor, Product class ının hem parametreli hem de parametresiz constructorı olduğu için overloading oldu
	{
		
	}

	
	
	 private int id;                              // attribute || field diye isimlendirilebilir.
	 private String name;                        // int id; => bu şekilde tanımlandığında default public olur, C# da private dir
	 private String description;                 // private köşeli parantezler arasında geçerli
	 private double price;
	 private int stockAmount;
	 private String renk;
	 private String kod;
	
	
	

	public int getId() {                      // eğer yazılması şart değil ise read only denir sadece getId yazılsa yeterli olur
		return id;
	}

	public void setId(int id) {
		this.id = id;                         // this içinde bulunduğu class ı kasteder
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {                     // kullanıcının kodu yazmasını engelledik
		return this.name.substring(0,1) + id;
	}

	
	}


