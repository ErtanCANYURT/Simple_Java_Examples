public class Hesap_ATM {
    private String HesapNo;
    private String İsim;
    private int password;
    private double bakiye;


   public Hesap_ATM(String hesapno,String isim, int password,double bakiye){
       
       this.HesapNo=hesapno;
       this.İsim=isim;
       this.password=password;
       this.bakiye=bakiye;
       
   }

    Hesap_ATM() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void ParaYatir(double miktar){
        this.setBakiye(this.getBakiye() + miktar);
        System.out.println("Yeni Bakiye = "+getBakiye());
    }
    public void ParaCek(double miktar){
        if(miktar>bakiye){
            System.out.println("Yetersiz bakiye ");
        }
        else{
             // this.setBakiye(this.getBakiye() - miktar);
        bakiye-=miktar;
        System.out.println("Yeni Bakiye = "+getBakiye());
        
        }
      
    }
    public void BakiyeSorgulama(){
        System.out.println("Güncel Bakiyeniz = "+getBakiye());
    }

    /**
     * @return the HesapNo
     */
    public String getHesapNo() {
        return HesapNo;
    }

    /**
     * @param HesapNo the HesapNo to set
     */
    public void setHesapNo(String HesapNo) {
        this.HesapNo = HesapNo;
    }

    /**
     * @return the İsim
     */
    public String getİsim() {
        return İsim;
    }

    /**
     * @param İsim the İsim to set
     */
    public void setİsim(String İsim) {
        this.İsim = İsim;
    }

    /**
     * @return the password
     */
    public int getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(int password) {
        this.password = password;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
}
