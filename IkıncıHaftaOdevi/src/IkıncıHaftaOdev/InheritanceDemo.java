package IkıncıHaftaOdev;

public class InheritanceDemo {

	public static void main(String[] args) 
	{
		KrediUI krediUI = new KrediUI();                                         // bir class sadece bir class ı inherit edebilir
        krediUI.KrediHesapla(new OgretmenKrediManager());                        // BaseKredi hem Ogretmen nin hem asker in hem de Tarım ın anası o yüzden KrediUI a anayı verip çocuğunu yollayabiliriz, çünkü referans tip
	}                                                                            

}
