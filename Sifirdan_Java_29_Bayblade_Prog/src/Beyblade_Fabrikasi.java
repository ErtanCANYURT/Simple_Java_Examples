
public class Beyblade_Fabrikasi {
    
    public Beyblade beybladeuret (String beyblade_turu){
        if (beyblade_turu.equals("Dragon")){
            return new Dragon("Takao", 300, 800, "Mavi Ejderha", "Kutsal Canavarla Konuşma");    
        }
        else if (beyblade_turu.equals("Drayga")){
           return new Dranza(beyblade_turu, "Beyaz Kaplan", "Rei", 800, 250);
        }
        else if (beyblade_turu.equals("Dranza")){
           return new Dranza(beyblade_turu, "Kırmızı Anka Kuşu", "Kai", 600, 400);
        }
        
        else
        return null;
    }
    
}
