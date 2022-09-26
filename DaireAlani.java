import java.util.Scanner;

public class DaireAlani {

    public static void main(String[] args) {
        double pi = 3.14, alan, cevre;
        int r;

        Scanner input = new Scanner(System.in);
        System.out.print("Yaricapi girin : ");
        r = input.nextInt();
        alan = pi * r * r ;
        cevre = 2 * pi * r;

        System.out.println("Dairenin Alaini : " + alan);
        System.out.println("Dairenin cevresi : " + cevre);

        //Daire diliminin  hesabi
        int angle;
        System.out.print("Aciyi girin : ");
        angle = input.nextInt();
        double partlyAlan = (pi*(r*r)*angle/360);
        System.out.println("Daire diliminin alani : " + partlyAlan);
    }
}
