
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        System.out.println("Beyblade programına hoş geldiniz...");
        System.out.println("Çıkış için press q...");
        Scanner scanner = new Scanner(System.in);
        
        while (true) {            
            System.out.println("Hangi Beyblade'i üretmek istiyorsunuz ?");
            String isim=scanner.nextLine();
            if(isim.equals("q")){
                System.out.println("Programdan çıkılıyor.");
                break;
            }
            else {
                Beyblade_Fabrikasi fabrika=new Beyblade_Fabrikasi();
                Beyblade beyblade=fabrika.beybladeuret(isim);
                
                if(beyblade==null){
                    System.out.println("Lütfen geçerli bir Beyblade ismi giriniz.");
                }
                else{
                    beyblade.Bilgileri_Goster();
                    beyblade.Saldir();
                    beyblade.Canavar_cikar();
                   
                }
            }
        }
        
    }
}
