import java.util.Scanner;

public class RecursiveAsalSayi {
    static void asalSayi(int i, int number){
        if (number == 2){
            System.out.println("Sayi asaldir.");
            return;
        }
        if (number == i){
            System.out.println("Sayi asaldir.");
            return;
        }
        if(number % i == 0){
            System.out.println("Sayi asal sayi degildir.");
            return;
        }
        asalSayi(++i,number);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi girin : ");
        int number = input.nextInt();

        asalSayi(2,number);
    }
}
