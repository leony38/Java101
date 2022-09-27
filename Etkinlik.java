import java.util.Scanner;

public class Etkinlik {
    public static void main(String[] args) {
        int temperature;
        Scanner input = new Scanner(System.in);

        System.out.print("Hava sicakligi : ");
        temperature = input.nextInt();
        
        if (temperature < 5) {
            System.out.println("Kayak super bir fikir!");
        } else if (temperature > 5 && temperature <=15) {
            System.out.println("Sinemaya gidin!");
        } else if (temperature > 15 && temperature < 25) {
            System.out.println("Piknik super olur!");
        } else {
            System.out.println("Yuzmeye gidin!");
        }
    }
}
