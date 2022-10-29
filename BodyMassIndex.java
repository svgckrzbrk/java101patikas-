package Java101Dersleri;
import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        double kg,m,bmı;
        Scanner input= new Scanner(System.in);
        System.out.print("Lütfen Kilonuzu Giriniz: ");
        kg=input.nextDouble();
        System.out.print("Lütfen Boyunuzu Giriniz: ");
        m= input.nextDouble();
        bmı=kg/(m*m);
        System.out.println("Vücut Kitle Endeksiniz: " +bmı + " m²");

        if(bmı < 18.5) {
            System.out.println("İdeal Kilonun Altında ");
        }else if (bmı < 25) {
            System.out.println("İdeal Kiloda");
        }else if (bmı < 30) {
            System.out.println("İdeal Kilonun Üstünde");
        }else {
            System.out.println("Obezite");
        }

    }
}
