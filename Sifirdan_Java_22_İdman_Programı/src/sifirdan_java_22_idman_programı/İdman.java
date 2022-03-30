
package sifirdan_java_22_idman_programı;

import java.util.Scanner;

public class İdman {
    
    private int burpee_sayisi;
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squat_saayisi;
    
    Scanner scanner=new Scanner(System.in);

    public İdman(int burpee_sayisi, int pushup_sayisi, int situp_sayisi, int squat_saayisi) {
        this.burpee_sayisi = burpee_sayisi;
        this.pushup_sayisi = pushup_sayisi;
        this.situp_sayisi = situp_sayisi;
        this.squat_saayisi = squat_saayisi;
    }

    public int getBurpee_sayisi() {
        return burpee_sayisi;
    }

    public void setBurpee_sayisi(int burpee_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
    }

    public int getPushup_sayisi() {
        return pushup_sayisi;
    }

    public void setPushup_sayisi(int pushup_sayisi) {
        this.pushup_sayisi = pushup_sayisi;
    }

    public int getSitup_sayisi() {
        return situp_sayisi;
    }

    public void setSitup_sayisi(int situp_sayisi) {
        this.situp_sayisi = situp_sayisi;
    }

    public int getSquat_saayisi() {
        return squat_saayisi;
    }

    public void setSquat_saayisi(int squat_saayisi) {
        this.squat_saayisi = squat_saayisi;
    }
    public boolean İdmanBittiMi(){
        return (burpee_sayisi==0)&&(pushup_sayisi==0)&&(situp_sayisi==0)&&(squat_saayisi==0);
    }
    
    public void Hareket(String tur,int miktar){
           
        if (tur.equals("Burpee")){
            burpee_sayisi-=miktar;
           
            if(burpee_sayisi<0){
                System.out.println("Tebrikler Hedeflenen Burpee Sayısını Geçtiniz.");
            }
            else{
                System.out.println("Kalan Burpee Sayisi : "+miktar);
            }
                
        }
        else if(tur.equals("Pushup")){
           
            pushup_sayisi-=miktar;
            if(pushup_sayisi<0){
                System.out.println("Tebrikler Hedeflenen Push-up Sayısını Geçtiniz.");
            }
            else{
                System.out.println("Kalan Push-up Sayisi : "+miktar);
            }
        }
        else if(tur.equals("Situp")){
           
            situp_sayisi-=miktar;
            if(situp_sayisi<0){
                System.out.println("Tebrikler Hedeflenen Sit-up Sayısını Geçtiniz.");
            }
            else{
                System.out.println("Kalan Sit-up Sayisi : "+miktar);
            }
        }
        else if(tur.equals("Squat")){
         
            squat_saayisi-=miktar;
            if(squat_saayisi<0){
                System.out.println("Tebrikler Hedeflenen Squat Sayısını Geçtiniz.");
            }
            else{
                System.out.println("Kalan Squat Sayisi : "+miktar);
            }
        }
        else{
            System.out.println("Yanlış Seçim Yaptınız...");
        }
        
        
    }
    
    
    
}
