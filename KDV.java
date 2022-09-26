import java.util.Scanner;

public class KDV {

    public static void main(String[] args) {
        double tutar, kdv, toplam, kdvTutar;

        Scanner input = new Scanner(System.in);
        kdv = 0.18;
        System.out.print("Tutari girin : ");
        tutar = input.nextDouble();

        // Tutar 1000 den buyukse kdv 0.08 degilse 0.18 olarak hesaplanir.
        boolean kdvOrani = (tutar > 0) && (tutar < 1000) ;
        kdv = kdvOrani ? 0.18 : 0.08;
        kdvTutar = tutar * kdv;
        toplam = tutar + kdvTutar;
        System.out.println("Toplam KDV'li Fiyat : " + toplam);
        System.out.println("KDV tutari : " + kdvTutar );
        System.out.println("KDV orani : " + kdv);


    }
}
