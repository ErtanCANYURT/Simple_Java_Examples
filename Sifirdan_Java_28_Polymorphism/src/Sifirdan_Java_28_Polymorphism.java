
class Hayvan {
    private String isim;
    
    public  Hayvan(String isim){
        this.isim=isim;
    }
    
    public String getIsim(){
        return isim;
    }
    
    public void setIsim (String isim){
        this.isim=isim;
    }
    
    public String Konus (){
           return "Hayvan konusuyor.";
}
    class Kedi extends Hayvan{

        public Kedi(String isim) {
            super(isim);
        }

        @Override
        public String Konus() {
            return this.getIsim()+"miyavlıyor.";
        }
        
    }
    
    class Kopek extends Hayvan{

        public Kopek(String isim) {
            super(isim);
        }

        @Override
        public String Konus() {
            return this.getIsim()+"Havlıyor.";
        }
        
    }
    
    class At extends Hayvan{

        public At(String isim) {
            super(isim);
        }

        @Override
        public String Konus() {
            return this.getIsim()+"Kişniyor. ";
        }
        
    }
    
}

public class Sifirdan_Java_28_Polymorphism {
 
  public static void konustur(Hayvan hayvan){
            System.out.println(hayvan.Konus());
        }
         public static void main(String[] args) {
      
         //    konustur(new Kedi("Köğek"));
    }

    
}
