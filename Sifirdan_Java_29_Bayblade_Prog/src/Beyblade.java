public class Beyblade {
    
    String Beybladeci;
    private int  Saldiri_gücü;
    private  int Dönüş_hizi;

    public Beyblade(String Beybladeci, int Saldiri_gücü, int Dönüş_hizi) {
        this.Beybladeci = Beybladeci;
        this.Saldiri_gücü = Saldiri_gücü;
        this.Dönüş_hizi = Dönüş_hizi;
    }

    public String getBaybladeci() {
        return Beybladeci;
    }

    public void setBaybladeci(String Baybladeci) {
        this.Beybladeci = Baybladeci;
    }

    public int getSaldiri_gücü() {
        return Saldiri_gücü;
    }

    public void setSaldiri_gücü(int Saldiri_gücü) {
        this.Saldiri_gücü = Saldiri_gücü;
    }

    public int getDönüş_hizi() {
        return Dönüş_hizi;
    }

    public void setDönüş_hizi(int Dönüş_hizi) {
        this.Dönüş_hizi = Dönüş_hizi;
    }
    
    
    public void Saldir(){
        System.out.println(Beybladeci+" "+Saldiri_gücü+" ile saldırıyor.");
    
}
    
    public void Canavar_cikar(){
        
        System.out.println("Bu beyblade'in kutsal canavarı bulunmamaktadır.");
    }
    public void Bilgileri_Goster(){
        System.out.println("Beybladeci ismi : " +Beybladeci);
        System.out.println("Saldiri Gücü : "+ Saldiri_gücü);
        System.out.println("Dönüş hızı : "+Dönüş_hizi);
        
    
}
}
