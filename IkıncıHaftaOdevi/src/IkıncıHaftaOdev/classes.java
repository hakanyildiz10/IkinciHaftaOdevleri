package IkıncıHaftaOdev;

public class classes {
                                                                          // class ların temel özelliği gruplama yapmak
	public static void main(String[] args) 
	{
		 CustomerManager customerManager = new CustomerManager();         // class ları çağırma işlemi, class lar referans tiptir                       
         CustomerManager customerManager2 = new CustomerManager();        // bellek te iki nesne var ama ayrı ayrı tutuluyor
		 customerManager = customerManager2;                              // kodu yazınca stack da cm 101, cm2 102 iken cm de 102 olur,sonrasında garbage collector heap de tutulan 101 kodunu siler
         customerManager.Add();
         customerManager.Remove();
         customerManager.Update();
         
         int sayi1 = 10;
         int sayi2 = 20;
         sayi2 = sayi1;                               // sayi2 nin değeri artık sayi1 in değeri demektir
         sayi1 = 30;                                  // int double float byte => value tip dir (değer tip)
         System.out.println(sayi2);
         
         int[] sayilar1 = new int[] {1,2,3};        // diziler referans tiptir, steak de s1 ve s2 tutulur, heap de 123 ve 456 tutulur, eşitleyince ikisi de heap de 123 ü tutar
         int[] sayilar2 = new int[] {4,5,6};
         sayilar2 = sayilar1;
         sayilar1[0] = 10;
         System.out.println(sayilar2[0]);
         
         
	}

}

    
     


