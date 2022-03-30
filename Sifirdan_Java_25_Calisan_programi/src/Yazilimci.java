
public class Yazilimci extends Calisan{
    private String diller;
    
    
    
    
    public Yazilimci(String ad, String soyad,int id, String diller){
        super(ad,soyad,id);
        this.diller=diller;
        
    }
    public void Format_at(String isletim_sistemi){
        System.out.println(getAd()+" "+isletim_sistemi+" isletim sistemi yükleniyor...");
        
    }

    @Override
    public void Bilgi_Goster() {
        super.Bilgi_Goster(); 
        System.out.println("Yazılımcının bildiği diller : "+diller);
    }
}
