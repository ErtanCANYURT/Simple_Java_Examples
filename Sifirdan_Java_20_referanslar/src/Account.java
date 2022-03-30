public class Account {
    
  private String hesapno;
  private double bakiye;
  private String isim;
   private String email;
   private String telno;
   
   public void bilgilerigoster (){
       System.out.println("hesap no "+this.hesapno);
        System.out.println("isim no "+this.isim);
         System.out.println("tel no "+this.telno);
          System.out.println("email no "+this.email);
           System.out.println("bakiye no "+this.bakiye);
       
   }
   public Account(String hesapno, String isim, String telno){
      /* this.isim=isim;
       this.hesapno=hesapno;
       this.telno=telno;
       this.email="Bilgi yok";
       this.bakiye=0.0;*/
       this(hesapno,0.0,isim,"Bilgi yok,", telno);
   }

   public Account(){
       
      /* this.hesapno="Bilgi Yok";
       this.bakiye=0.0;
       this.email="Bilgi Yok";
       this.isim="Bilgi Yok";
       this.telno="Bilgi Yok";*/
       this("Bilgiyok", 0.0, "Bilgi Yok", "Bilgi Yok", "Bilgi yok");
       }
   public Account(String hesapno, double bakiye,String isim,String email,String telno){
       this.hesapno=hesapno;
       this.bakiye=bakiye;
       this.isim=isim;
       this.email=email;
       this.telno=telno;
       
   }
   
   public void ParaYatir(double miktar){
       this.bakiye +=miktar;
       System.out.println("Yeni bakiye = "+bakiye );
   }
   public void ParaCekme(double miktar){
       if (miktar>1500){
           System.out.println("1500 den fazla para çekemezsiniz");
           
       }
       if (miktar>bakiye)
       {
           System.out.println("yeterli Bakiye yok  Bakiye= "+bakiye);
       }
       else
       {
           bakiye-=miktar;
           System.out.println("Yeni Bakiye = "+bakiye);
       }
   }
    /**
     * @return the hesapno
     */
    public String getHesapno() {
        return hesapno;
    }

    /**
     * @param hesapno the hesapno to set
     */
    public void setHesapno(String hesapno) {
        this.hesapno = hesapno;
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

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telno
     */
    public String getTelno() {
        return telno;
    }

    /**
     * @param telno the telno to set
     */
    public void setTelno(String telno) {
        this.telno = telno;
    }
   
    
}
