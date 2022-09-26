import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        int a , b;
        double c, u, alan;
        Scanner input = new Scanner(System.in);
        System.out.print("Ucgenin 1.kenari : ");
        a = input.nextInt();
        System.out.print("Ucgenin 2.kenari : ");
        b = input.nextInt();

        c = Math.sqrt((a*a) +(b*b));
        System.out.println("Hipotenus : " + c);

        // Ucgenin alani
        u = (a + b + c) / 2;
        alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.println("Ucgenin alani : " + alan);
    }
}
