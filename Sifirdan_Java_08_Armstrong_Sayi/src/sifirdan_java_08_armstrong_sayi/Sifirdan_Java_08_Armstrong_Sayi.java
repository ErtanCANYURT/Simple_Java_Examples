package sifirdan_java_08_armstrong_sayi;

import java.util.Scanner;

public class Sifirdan_Java_08_Armstrong_Sayi {

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Sayiyi girin...");
        int sayi =scanner.nextInt();
        System.out.print("BAsamak sayisi....");
        int basamak_sayi=scanner.nextInt();
        int gecici_sayi=sayi;
        int toplam =0;
        
        do {            
            int basamak_degeri=gecici_sayi%10;
            gecici_sayi=gecici_sayi/10;
            
            toplam+=Math.pow(basamak_degeri, basamak_sayi);
            
         
        } while (gecici_sayi>0);
        
          if(sayi==toplam){
               System.out.println("Bir armstrong sayıdır");
           }
           else
                System.out.println("bir armstrong sayısı değildir");
        
    }
    
}
