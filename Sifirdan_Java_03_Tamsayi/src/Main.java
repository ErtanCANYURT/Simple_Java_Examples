
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("kilonuzu giriniz");
        Scanner scanner=new Scanner(System.in);
        double kilo = scanner.nextDouble();
        System.out.println("boyunuzu giriniz");
        double boy = scanner.nextDouble();
       double boy1=boy/100;
        scanner.nextLine();
        System.out.println("İsminizi giriniz.");
        String ad = scanner.nextLine();
        double ort= kilo/(boy1*boy1);
        System.out.println(ad+" vücut kitle endeksiniz="+ ort);
}

}
