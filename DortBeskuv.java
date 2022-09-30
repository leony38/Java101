import java.util.Scanner;

public class DortBeskuv {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sinir sayi : ");
        n = input.nextInt();

        for (int i =1 ; i <= n; i *= 4){
            System.out.println(i);
        }
        for (int j =1; j <= n; j *= 5){
            System.out.println(j);
        }
    }
}
