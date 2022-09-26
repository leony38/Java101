import java.util.Scanner;

public class Hesap1 {
    public static void main(String[] args) {
        int n1 , n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("1. sayiyi girin : ");
        n1 = input.nextInt();
        System.out.print("2. sayiyi girin : ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Seciminiz : ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Cikarma : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Carpma : " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Bolme : " + (n1 / n2));
                } else {
                    System.out.println("Bir sayi 0'a bolunemez!");
                }
                break;
            default:
                System.out.println("hatali secim, tekrar deneyin.");
        }
    }
}
