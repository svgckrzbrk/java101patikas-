package Java101Dersleri;
import java.util.Scanner;
public class daireAlanYaricap {
    public static void main(String[] args) {
        int r;
        double pi=3.14,alan,cevre,a,dilan;
        Scanner inp= new Scanner(System.in);
        System.out.print("Dairenin Yarıçapını Giriniz: ");
        r= inp.nextInt();
        alan=pi*r*r;
        cevre=2*pi*r;
        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);

        System.out.print("Lütfen Daire Diliminin Merkez Açısını Giriniz: " );
        a=inp.nextDouble();
        dilan= (pi * (r*r) * a) / 360;
        System.out.println("Daire Diliminin Alanı:"+ dilan);

    }
}