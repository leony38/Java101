import java.util.Scanner;
public class Kombinasyon {
    public Integer faktoriyel (int n) {
        int fac = 1;
        if (n >= 0) {
            if (n == 0) {
                return fac;
            } else {
                for (int i = 1; i <= n; i++) {

                    fac *= i;
                }
                return fac;
            }
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        int n;
        int r;
        double combination;

        Scanner input = new Scanner(System.in);
        System.out.print("n: ");
        n = input.nextInt();

        System.out.print("r: ");
        r = input.nextInt();

        Kombinasyon kom = new Kombinasyon();
        combination = (kom.faktoriyel(n)) / (kom.faktoriyel(r) * kom.faktoriyel((n-r)));

        System.out.println("C(n,r) = " + combination);

    }
}


