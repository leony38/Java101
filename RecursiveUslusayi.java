import java.util.Scanner;

public class RecursiveUslusayi {

    static int power(int a, int b){
        if (b == 0)
            return 1;
        return power(a,b-1)* a;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayi : ");
        int a = input.nextInt();
        System.out.print("2. Sayi : ");
        int b = input.nextInt();

        System.out.println("Sonuc : " + power(a, b));

    }
}
