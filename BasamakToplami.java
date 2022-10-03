import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number, num2, num3;
        int basamak = 0;
        int toplam = 0;
        System.out.print("bir sayi girin : ");
        number = input.nextInt();
        num2 = number;
        num3 = number;
        while (number > 0) {
            number = number / 10;
            basamak++;
        }
        for (int i =1; i <= basamak; i++){
            toplam += num2 % 10;
            num2 /=10;
        }
        System.out.println(num3 + " sayisinin basmaklarinin toplami " + toplam);

    }
}
