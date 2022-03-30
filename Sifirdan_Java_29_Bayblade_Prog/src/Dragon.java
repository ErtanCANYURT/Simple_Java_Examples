public class Dragon extends Beyblade{

    private String Kutsal_canavar;
    private String Gizli_yetenek;
    public Dragon(String Beybladeci, int Saldiri_gücü, int Dönüş_hizi, String Kutsal_canavar, String Gizli_yetenek) {
        super(Beybladeci, Saldiri_gücü, Dönüş_hizi);
        
        this.Kutsal_canavar=Kutsal_canavar;
        this.Gizli_yetenek=Gizli_yetenek;
        
        
    }

    @Override
    public void Bilgileri_Goster() {
        super.Bilgileri_Goster();
        
        System.out.println("Kutsal Canavar Adı : "+Kutsal_canavar);
    }

    @Override
    public void Canavar_cikar() {
        System.out.println(getBaybladeci()+" "+Kutsal_canavar+" ı ortaya çıkarıyor.");
        System.out.println(getBaybladeci()+" ın gizli saldırısı : " +Gizli_yetenek);
    }

    
    public String getKutsal_canavar() {
        return Kutsal_canavar;
    }

    public void setKutsal_canavar(String Kutsal_canavar) {
        this.Kutsal_canavar = Kutsal_canavar;
    }

    public String getGizli_yetenek() {
        return Gizli_yetenek;
    }

    public void setGizli_yetenek(String Gizli_yetenek) {
        this.Gizli_yetenek = Gizli_yetenek;
    }
    
    
    
}
