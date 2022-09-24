import java.util.Scanner;

public class NotOrt {
    public static void main(String[] args) {
        // Degiskenler
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner tanimlama
        Scanner input = new Scanner(System.in);

        // Degerler alinir
        System.out.print("Matematik Notu : ");
        mat = input.nextInt();

        System.out.print("Fizik Notu : ");
        fizik = input.nextInt();

        System.out.print("Kimya Notu : ");
        kimya = input.nextInt();

        System.out.print("Turkce Notu : ");
        turkce = input.nextInt();

        System.out.print("Tarih Notu : ");
        tarih = input.nextInt();

        System.out.print("Muzik Notu : ");
        muzik = input.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik) ;
        double sonuc = toplam / 6;
        System.out.println("Not Ortalamaniz : " + sonuc);

        boolean sonuc2 = sonuc >= 60;
        String str = sonuc2 ? "Gecti" : "Kaldi";
        System.out.println(str);

    }
}
