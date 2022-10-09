package IkıncıHaftaOdev;

public class methods {

	public static void main(String[] args)                 //main de bir metottur
	{
		sayıBulmaca();                                        //kodu çalıştırmak için main içinde çağır, fonksiyon yazarak kendini tekrarlamazsın
		   }
	
	public static void sayıBulmaca()
	{
		   int[] sayilar = new int[] {1,2,5,7,9,0};
		   int aranacak = 5;                                  //aranacak sayıBulmaca metodunda tanımlandığı için mesajVer de çağırılamaz,bu yüzden parametreli metot tanımlandı 
		   boolean varMi = false;
		   
		   for(int sayi : sayilar)
		   {
			   if(sayi == aranacak)
			   varMi = true;
			   break;                                          // döngüyü bitir
			   }
		   
		   String mesaj;
		   if(varMi) {
			mesaj = "Sayı mevcuttur: "+aranacak;
			mesajVer(mesaj);
		   }
		   else
		   {
			   mesajVer("Sayı mevcut değildir: "+aranacak);
		   }
	}
	
	public static void mesajVer(String mesaj)                       //parametreli metot denir, fonksiyon çalışacak ama bi de int türünde bi şey ver
	{
		System.out.println(mesaj);
	}

}
