import java.util.Scanner;

// BMI hesaplama
public class BMI {

    public static void main(String[] args) {
        double boy, kilo, bmi;

        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuz(Metre olarak) ? ");
        boy = input.nextDouble();
        System.out.print("Kilonuz ? ");
        kilo = input.nextDouble();
        bmi = kilo / (boy * boy);

        System.out.println("Vucut kitle indeksiniz : " + bmi);
    }
}
