public class Calisan {
    
    private String isim;
    private int maas;
    private String departman;
    
    public Calisan(String isim,int maas, String departmaan){
        this.isim=isim;
        this.departman=departmaan;
        this.maas=maas;
    }
    public void calis(){
        System.out.println("Çalışan çalışıyor....");
    }
    public void BilgileriGoster (){
        System.out.println("İsim : "+getIsim());
        System.out.println("Maas: "+getMaas());
        System.out.println("Departman : "+ getDepartman());
    }
    
    public void DepartmanDegistir(String Yeni_departman){
        System.out.println("Departman Degistiriliyor");
        this.setDepartman(Yeni_departman);
        
        System.out.println("Yeni departman : "+this.getDepartman());
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
     * @return the maas
     */
    public int getMaas() {
        return maas;
    }

    /**
     * @param maas the maas to set
     */
    public void setMaas(int maas) {
        this.maas = maas;
    }

    /**
     * @return the departman
     */
    public String getDepartman() {
        return departman;
    }

    /**
     * @param departman the departman to set
     */
    public void setDepartman(String departman) {
        this.departman = departman;
    }
    
}
