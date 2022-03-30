public class Yonetici extends Calisan{

    private String bolum;
    
    public Yonetici(String ad, String soyad, int id,String bolum) {
        super(ad, soyad, id);
        
        this.bolum=bolum;
        
    }
    
    public void isci_cikar(String isci){
        System.out.println(getAd()+" " + isci +" kişisi çıkarılıyor...");
        
    }

    @Override
    public void Bilgi_Goster() {
        super.Bilgi_Goster();
        System.out.println("Yöneticinin bölümü : " +bolum);
    }
    
    
    
}
