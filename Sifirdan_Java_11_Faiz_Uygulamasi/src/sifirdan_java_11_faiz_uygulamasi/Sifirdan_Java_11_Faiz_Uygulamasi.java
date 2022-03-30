package sifirdan_java_11_faiz_uygulamasi;

import java.util.Scanner;

public class Sifirdan_Java_11_Faiz_Uygulamasi {


    public static void main(String[] args) {
       
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Hosgeldiniz. \nYatırmak istediginiz para miktarını giriniz.");
        double apara=scanner.nextDouble();
        System.out.println("Kac yil yatirmak istersiniz.");
        int yil=scanner.nextInt();
        double toplam=apara,yfaiz;
       
        
        for(int i=1;i<=yil;i++){
             yfaiz=(toplam/100)*6;
             toplam=toplam+yfaiz;
             System.out.println(i+" Yıllık toplam para : "+toplam);
        }
        
    }
    
}
