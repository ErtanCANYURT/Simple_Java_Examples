
import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;


public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Calisan calisan1=new Calisan("Ahmet ", "Mehmet", 1);
        Yazilimci yazilimci1=new Yazilimci("Ertan", "CANYURT", 44, "C VE JAVA");
        Yonetici yonetici1=new Yonetici("Zeki", "Çalışkan", 2, "Mobil");

        System.out.println("Çalışanlar programına hoş geldiniz...");
        
        String islem_isim="İşlemler...\n"
                + "1. Yazılım işlemleri \n"
                + "2. Yönetici işlemleri\n"
                + "Çıkış için q \n"
                +"İşlem seçiniz...";
        
        
        while (true) {            
           
            System.out.println(islem_isim);
            String islem=scanner.nextLine();
        
        if(islem.equals("q")){
            
            System.out.println("Programdan çıkılıyor....");
            break;
        }
        else if (islem.equals("1")) {
            
            yazilimci1.Bilgi_Goster();
            
            System.out.println("Format atmak için press '44' ");
            String islem2=scanner.nextLine();
            if(islem2.equals("44")){
                yazilimci1.Format_at("Windows 10");
            }
            else 
                break;
            }
        else if (islem.equals("2")){
            yonetici1.Bilgi_Goster();
            System.out.println("İşçi çıkarmak için press '34'");
            
            String islem2=scanner.nextLine();
            
            if(islem2.equals("34")){
                yonetici1.isci_cikar("Tayfun");
            }
            else
                break;
        }
        
        else{
            System.out.println("Yanlış giriş yaptınız...\n Tekrar deneyiniz...");
        }
        
        
        }
    }
}
