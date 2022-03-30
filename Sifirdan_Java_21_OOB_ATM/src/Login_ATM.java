
import java.util.Scanner;

public class Login_ATM {
    public boolean login(Hesap_ATM hesap) {
        
   
   
        
      Hesap_ATM hesap_ATM1=new Hesap_ATM("211565", "Ertan CANYURT", 1561, 500.0);

       Scanner scanner=new Scanner(System.in);
        System.out.println("Hesap no Giriniz.....");
        String hesno=scanner.nextLine();
        System.out.println("Şifre giriniz....");
        int sifre= scanner.nextInt();
        
        if(hesap_ATM1.getHesapNo().equals(hesno)&&hesap_ATM1.getPassword()==sifre){
            return true;
        }
        else
           return false;
           

                
        
 }
}