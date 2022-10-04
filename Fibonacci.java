import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = 0,n2 = 1,n3, count;
        System.out.print("Fibonacci serisinin eleman sayısını giriniz:  ");
        count = input.nextInt();

        System.out.print(n1); // ilk önce 0 yazdırıyoruz

        for (int i = 2; i < count; i++){
            n3 = n1 + n2;
            System.out.print(" " + n3); // daha sonra 0 ve 1 toplamı olan 1'i yazdırıp döngüye sokuyoruz.
            n1 = n2;
            n2 = n3;

        }

    }
}
