
public class Dranza extends Beyblade{

    
    private String Kutsal_canavar;
    private String Gizli_yetenek;
    
    public Dranza(String Gizli_yetenek, String Kutsal_canavar,String Beybladeci, int Saldiri_gücü, int Dönüş_hizi) {
        super(Beybladeci, Saldiri_gücü, Dönüş_hizi);
        
        this.Gizli_yetenek=Gizli_yetenek;
        this.Kutsal_canavar=Kutsal_canavar;
    }
    

    @Override
    public void Bilgileri_Goster(){
        super.Bilgileri_Goster();
        System.out.println("Kutsal Canavar Adı : "+Kutsal_canavar);
    }
    public void Canavar_Cıkar(){
        System.out.println(getBaybladeci()+" "+Kutsal_canavar +" ı ortaya çıkar.");
        System.out.println(getBaybladeci()+" ın gizli saldırısı : "+Gizli_yetenek);
    } 
    
}
