package IkıncıHaftaOdev;

public class methods2 {

	public static void main(String[] args) {                       // metot, operasyon, fonksiyon aynı şeydir
		String mesaj = "Bugün hava çok güzel"; 
		String yeniMesaj = sehirVer();
		//String yenimesaj = mesaj.substring(0,2);                 // void metotlarında ekrana yazdırmak için bu şekilde değeri return etmek gerek
		System.out.println(yeniMesaj);
        //int sayi = topla(5,7);
		//System.out.println(sayi);
	    int toplam = topla2(2,3,4,5,6,10);          
	    System.out.println(toplam);
	}
	public static void ekle()                                       // void operasyonu emir gibi, bir şeyin yapılması istenir
	{
	  System.out.println("eklendi");	
	}
	public static void sil()
	{
		System.out.println("silindi");
	}
	public static void guncelle()
	{
		System.out.println("güncellendi");
	}
	public static int topla2 (int...sayilar )                            // fonksiyon int türünde değer döndürür, alta yazılan return bitir ve 5 yazdır demek
	{                                                                    // int... sayilar int array gibi tanımlamak demek (variable argument) genelde çok tercih edilmez. 
		int toplam =0;
		for (int sayi:sayilar)
		{
			toplam+=sayi;
		}
		return toplam;
	}
	public static String sehirVer()
	{
		return "Ankara";
	}
	
	

}
