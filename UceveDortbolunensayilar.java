import java.util.Scanner;

public class UceveDortbolunensayilar {
    public static void main(String[] args) {
        int k, toplam = 0, sayac = 0;
        double ortalama;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi girin : ");
        k = input.nextInt();
        for (int i = 0; i <= k; i++){
            if (i % 3 == 0 && i % 4 == 0){
                sayac++;
                System.out.println(i);
                toplam += i;
            } else {
                continue;
            }
        }
        ortalama = toplam / sayac;
        System.out.print("Ortalama : " + ortalama);
    }
}
