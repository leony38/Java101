import java.util.Scanner;

public class Taksimetrre {

    public static void main(String[] args) {
        double km = 2.20, acilis = 10, toplamkm, tutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Toplam km : ");
        toplamkm = input.nextDouble();
        tutar = toplamkm * km + acilis;
        tutar = tutar < 20 ? 20 : tutar;
        System.out.println("Taksi ucreti : " + tutar);
    }
}
