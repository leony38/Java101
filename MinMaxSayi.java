import java.util.Scanner;

public class MinMaxSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, min = 1, max = 1;
        System.out.print("Kac adet sayi gireceksiniz : ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.print(i+". sayiyi : ");
            sayi = input.nextInt();
            if (i == 1){
                min = sayi;
                max = sayi;
            }
            if (sayi > max){
                max = sayi;
            }
            if (sayi < min){
                min = sayi;
            }

        }
        System.out.println("En kucuk sayi : " + min);
        System.out.println("En buyuk sayi : " + max);

    }
}
