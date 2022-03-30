
import java.util.Scanner;

public class ATM {
    
    public void calis(Hesap_ATM hesap_ATM1){
        Login_ATM login_ATM1=new Login_ATM();
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bankamıza hoş geldiniz......");
        System.out.println("********************");
        
        System.out.println("Kullanıcı Girişi\n"
                + "*********************************");
        int giris_hakki=3;
        while (true){
            if(login_ATM1.login(hesap_ATM1)){
                System.out.println("Giris basarili");
                break;
            }
            else{
                giris_hakki--;
                System.out.println("Giris basarisiz. \n kalan giris hakki "+giris_hakki);
                
            }
            if(giris_hakki==0){
                System.out.println("Giris hakkiniz bitti");
                return;
            }
        }
        System.out.println("*********************");
        String islemler ="1.bakiye görüntüleme\n"
                + "2.para yatırma\n"
                + "3para çeme\n"
                + "çıkış için q\n";
        
       
        while(true){
            System.out.println("İşlemi seçiniz.\n"+islemler);
            String islem=scanner.nextLine();
            
            if(islem.equals("q")){
                break;
            }
            else if(islem.equals("1")){
                System.out.println(hesap_ATM1.getBakiye());
            }
            else if (islem.equals("2")){
                System.out.println("Yatırılacak miktar :");
                int miktar = scanner.nextInt();
                scanner.nextLine();
                hesap_ATM1.ParaYatir(miktar);
                
            }
            else if (islem.equals("3")){
                System.out.println("Çekmek istediğiniz tutar");
                int miktar=scanner.nextInt();
                scanner.nextLine();
                hesap_ATM1.ParaCek(miktar);
            }
            else  {
                System.out.println("Geçersiz işlem");
        }
        }
    }
}
