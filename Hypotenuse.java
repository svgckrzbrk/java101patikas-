package Java101Dersleri;
import java.util.Scanner;
public class Hypotenuse {
    public static void main(String[] args) {
        int a,b;
        double c;
        Scanner girdi=new Scanner(System.in);
        System.out.print("A Kenarını Giriniz: ");
        a= girdi.nextInt();
        System.out.print("B Kenarını Giriniz: ");
        b= girdi.nextInt();

        c=Math.sqrt((a*a)+(b*b));

        System.out.println("Hipotenüs: " +c);

        System.out.println("......................");

        double d,e,f,cevre, alan,u;
        Scanner veri= new Scanner(System.in);
        System.out.print("D Kenarını Giriniz: ");
        d= veri.nextDouble();
        System.out.print("E Kenarını Giriniz: ");
        e= veri.nextDouble();
        System.out.print("F Kenarını Giriniz: ");
        f= veri.nextDouble();

        u=(d+e+f)/2;
        cevre=(2*u);
        System.out.println("Üçgenin Çevresi: "+cevre+ "cm");
        alan= Math.sqrt(u*(u-d)*(u-e)*(u-f));
        System.out.println("Üçgenin Alanı: " +alan+ "cm");








    }


}
