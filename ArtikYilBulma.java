import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class ArtikYilBulma {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);
        System.out.print("Yili Girin : ");
        year = input.nextInt();

        if(year % 4 == 0) {
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println(year + " Artik yildir.");
                    return;
                }else {
                    System.out.println(year + " Artik yil degildir.");
                    return;
                }
            }
            System.out.println(year + " Artik yildir.");
        }else{
            System.out.println(year + " Artik yil degildir.");
        }
    }
}
