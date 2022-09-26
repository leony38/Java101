import java.util.Scanner;

// Manav kasa hesabini yapan kod
public class Manav {

    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican, toplam;
        double aPrice = 2.14, ePrice = 3.67, dPrice=1.11, mPrice=0.95, pPrice=5;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kac kilo ? ");
        armut = input.nextDouble();
        System.out.print("Elma Kac kilo ? ");
        elma = input.nextDouble();
        System.out.print("Domates Kac kilo ? ");
        domates = input.nextDouble();
        System.out.print("Muz Kac kilo ? ");
        muz = input.nextDouble();
        System.out.print("patlican Kac kilo ? ");
        patlican = input.nextDouble();

        toplam =( (armut*aPrice) + (elma*ePrice) + (domates*dPrice) + (muz*mPrice) + (patlican*pPrice));
        System.out.println("Toplam Tutar : " + toplam);


    }
}
