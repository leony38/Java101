import java.util.Scanner;

public class CiftDordunkati {
    public static void main(String[] args) {
        int number;
        int total = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Bir sayi girin : ");
            number = scan.nextInt();
            if ((number % 2 == 0) && (number % 4 == 0)){
                total += number;
            }
        } while (number % 2 == 1);
        System.out.println("Toplam : " + total);
    }
}
