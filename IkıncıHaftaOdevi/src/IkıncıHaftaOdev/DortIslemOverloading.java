package IkıncıHaftaOdev;

public class DortIslemOverloading 
{
   public int topla(int sayi1, int sayi2)     
   {
	   return sayi1 + sayi2;                                 //burada ikisi de topla metodu ancak biri 2 tane int diğeri 3 tane int istiyor o yüzden metot overloading oldu diğer class da ikisi de çağırılabilir. 
   }
   public int topla(int sayi1, int sayi2, int sayi3)
   {
	   return sayi1 + sayi2 + sayi3;

   }
}
