import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, muzik, ders = 0;
        double total = 0, average =0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notu : ");
        mat = input.nextInt();
        if (0 < mat && mat <100) {
            total += mat;
            ders++;
        }
        System.out.print("Fizik notu : ");
        fizik = input.nextInt();
        if (0 < fizik && fizik < 100){
            total += fizik;
            ders++;
        }

        System.out.print("Kimya notu : ");
        kimya = input.nextInt();
        if(0< kimya && kimya < 100){
            total += kimya;
            ders++;
        }
        System.out.print("Turkce notu : ");
        turkce = input.nextInt();
        if (0< turkce && turkce < 100){
            total += turkce;
            ders++;
        }
        System.out.print("Muzik notu : ");
        muzik = input.nextInt();
        if (0< muzik && muzik <100) {
            total += muzik;
            ders++;
        }

        average = total / ders ;

        if(average <= 55) {
            System.out.println("Sinifta kaldiniz, seneye bekleriz.");
        } else {
            System.out.println("Sinifi gectiniz.");
        }
        System.out.println("Not ortalamaniz : " + average);
    }
}
