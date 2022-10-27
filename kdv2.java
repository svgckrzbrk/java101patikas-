package Java101Dersleri;
import java.util.Scanner;
public class kdv2 {
    public static void main(String[] args) {
        double kdv=0.18,kdv2=0.08,kdv2Tutar,kdvTutar,kdvliTutar,kdv2liTutar;
        double ucret;
        Scanner input2= new Scanner(System.in);
        System.out.print(" Ücreti Giriniz: ");
        ucret= input2.nextDouble();

        kdvTutar=ucret*kdv;
        kdv2Tutar=ucret*kdv2;
        kdvliTutar=kdvTutar+ucret;
        kdv2liTutar=kdv2Tutar+ucret;

        boolean kosul1= (ucret>1000);
        boolean kosul2= (ucret<=1000);
        boolean kosul3= (kdvliTutar>1180);
        boolean kosul4= (kdv2liTutar<=1080);
        double dbl= kosul2? kdvTutar:kdv2Tutar;
        double dbl2= kosul4? kdvliTutar:kdv2liTutar;
        System.out.println("Kdv Tutarı:" +dbl);
        System.out.println("Kdvli Tutar: "+dbl2);






    }
}
