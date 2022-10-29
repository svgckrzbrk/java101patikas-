package Java101Dersleri;
import java.util.Scanner;
public class Grocery {
    public static void main(String[] args) {
        double elma,armut,domates,patlican,muz,toplam;
        Scanner inp=new Scanner(System.in);
        System.out.print ("Elma Fiyatı: " );
        elma= inp.nextDouble();
        System.out.print("Armut Fiyatı: ");
        armut=inp.nextDouble();
        System.out.print("Domates Fiyatı: ");
        domates=inp.nextDouble();
        System.out.print("Patlican Fiyatı: ");
        patlican=inp.nextDouble();
        System.out.print("Muz Fiyatı: ");
        muz= inp.nextDouble();

        toplam=(elma+armut+domates+patlican+muz);
        System.out.print("toplam" +toplam + " tl");
    }
}
