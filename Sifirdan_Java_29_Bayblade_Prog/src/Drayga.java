
public class Drayga extends Beyblade{

    
    private String Kutsal_canavar;
    private String Gizli_yetenek;
    
    public Drayga(String Kutsal_canavar,String Gizli_yetenek,String Beybladeci, int Saldiri_gücü, int Dönüş_hizi) {
        super(Beybladeci, Saldiri_gücü, Dönüş_hizi);
        this.Kutsal_canavar=Kutsal_canavar;
        this.Gizli_yetenek=Gizli_yetenek;
        
        
                
    }

    @Override
    public void Bilgileri_Goster() {
        super.Bilgileri_Goster();
        
        System.out.println("Kutsal Canavar Adı: " +Kutsal_canavar);
    }

    @Override
    public void Canavar_cikar() {
        System.out.println(getBaybladeci()+" " + Kutsal_canavar+" ı ortaya çıkarıyor."); 
     
        System.out.println(getBaybladeci()+" saldırısı : " +Gizli_yetenek);
    }
    
    
    
    
}
