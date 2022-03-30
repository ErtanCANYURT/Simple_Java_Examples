package sifirdan_java_16_ekok;

import java.util.Scanner;

public class Sifirdan_Java_16_Ekok {

    public static int Ekok (int sayi1 , int sayi2) {
        int ekok=1;
        for (int i=1;i<=sayi1&&i<=sayi2;i++){
            if ((sayi1%i==0)&&(sayi2%i==0)) {
                ekok=ekok*i;
                System.out.println(ekok);
            }
          
        }
        return ekok;
    }
    public static void main(String[] args) {
  //Çalışmadı!!!!!!!!!!!!!!!!!!.................................!!!!!!!!!!!!!!!!!!!!!
        Scanner scanner =new Scanner(System.in);
           System.out.println("Birinci sayiyi giriniz...");
        int birinci_sayi= scanner.nextInt();
        System.out.println("ikinci sayiyi giriniz...");
        int ikinci_sayi= scanner.nextInt();
        Ekok(birinci_sayi, ikinci_sayi);
    }
    
}
