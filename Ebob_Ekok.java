import java.util.Scanner;

public class Ebob_Ekok {
    public static void main(String[] args) {
        int ebob = 1, n1, n2;
        double ekok=0.0;  boolean rw = false;
        Scanner read = new Scanner(System.in);

        System.out.print("n1 girin : ");
        n1=read.nextInt();
        System.out.print("n2 girin : ");
        n2=read.nextInt();

        do {
            if (n1 <= 0 || n2 <= 0) {
                System.out.print("Girdiğiniz sayılardan biri negatif. Lütfen pozitif sayı giriniz");
            } else {
                rw = true;
            }
        } while (!rw);


        int i = n1;
        while (i >= 1) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                System.out.println("Girdiğiniz iki sayının en büyük ortak böleni: " + i);
                ebob = i;
                break;
            } else {
                i--;
            }

        }

        ekok= (n1 * n2) / ebob;
        System.out.println("Girdiğiniz iki sayının en küçük ortak katı: "+ekok);
    }
}
