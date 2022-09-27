import java.util.Scanner;
public class BiletHesaplama {
    public static void main(String[] args) {
        int age, bilet;
        double mesafe, toplam;

        Scanner input = new Scanner(System.in);

        System.out.print("Gidilecek mesafe km olarak : ");
        mesafe = input.nextDouble();
        System.out.print("Bilet tek gidisse 1 donus ise 2 : ");
        bilet = input.nextInt();
        System.out.print("Yasiniz : ");
        age = input.nextInt();

        if (bilet < 1 || bilet > 2 || age < 0 || mesafe < 0) {
            System.out.println("Hatali giris!");
            return;
        }

        toplam = 0.10 * mesafe;

        if (bilet == 2) {
            toplam= toplam - (toplam * 0.20);
            if (age <12) {
                toplam = toplam/2;
            } else if (age > 12 && age < 12) {
                toplam = toplam - (toplam * 0.10);
            } else if (age > 65) {
                toplam = toplam - (toplam * 0.30);
            }
        }
        System.out.println("Toplam Tutar : " + toplam);
    }
}
