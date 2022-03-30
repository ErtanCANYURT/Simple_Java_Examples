
public class Main {
    
    public static void main(String[] args) {
   ATM atm=new ATM();
  Hesap_ATM hesap_ATM1=new Hesap_ATM("211565", "Ertan CANYURT", 1561, 500.0);
  
  atm.calis(hesap_ATM1);
        System.out.println("programdan cıkılıyor.....");
}
}
