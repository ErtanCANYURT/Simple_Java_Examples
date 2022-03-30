public class Yonetici extends Calisan {
    
    
    private int sorumlu_kisi;
    
    Calisan calisan1=new Calisan("Erasdtan", 10, "asdddd");
    
    public Yonetici(String isim, int maas,String departman,int sorumlu_kisi){
      /*  this.isim=isim;
        this.maas=maas;
        this.departman=departman;*/
     /*Önemli*/super(isim,maas,departman);
      this.sorumlu_kisi=sorumlu_kisi;
         
    }
    public void Zam_Yap(int zam_Yap){
        System.out.println("Çalışanlara "+zam_Yap+" TL zam yapıldı.");
    }
    public void bilgilerigoster(){
        //calisan1.BilgileriGoster();
        super.BilgileriGoster();
        System.out.println("Sorumlu kişi sayısi : " +this.sorumlu_kisi);
    }
}
