package sifirdan_java_22_idman_programı;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
    
    Scanner scanner =new Scanner(System.in);
    
        System.out.print("Burpee Sayisi : ");
        int burpee=scanner.nextInt();
        System.out.print("Push-up sayisi : ");
        int pushup= scanner.nextInt();
        System.out.print("Sit-up Sayisi : ");
        int situp = scanner.nextInt();
        System.out.print("Squat Sayisi : ");
        int squat = scanner.nextInt();
         
        scanner.nextLine();
        
        İdman idman1=new İdman(burpee, pushup, situp, squat);
        System.out.println("İdman Başlıyor !!!!!");
        
        while (idman1.İdmanBittiMi()==false){
           System.out.println("Hareket Türü seciniz (burpee, pushup, situp, squat) : ");
           String tur1= scanner.nextLine();
           System.out.println("Bu Hareketten kaç tane Yapacaksınız");
            int miktar1=scanner.nextInt();
            scanner.nextLine();
            
            idman1.Hareket(tur1,miktar1);
           
           
           
        }
    
}
}