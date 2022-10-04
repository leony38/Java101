import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi girin : ");
        int sayi = input.nextInt();
        int toplam = 0;
        for(int i = 1; i<=(sayi/2); i++){
            if(sayi % i == 0){
                toplam = toplam + i;
            }
        }

        if(toplam == sayi){
            System.out.println(sayi+" sayisi bir mükemmel sayıdır.");
        }else{
            System.out.println(sayi+" sayisi bir mükemmel sayı değildir.");
        }
    }
}
