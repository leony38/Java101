import  java.util.Scanner;


public class ChineseZodiac {
    public static void main(String[] args) {
        int year, remain ;

        Scanner input = new Scanner(System.in);

        System.out.print("Dogum Yiliniz : ");
        year = input.nextInt();

        remain = year % 12;
        System.out.println(remain);

        if (remain == 0){
            System.out.println("Cin zodyagi burcunuz Maymun");
        } else if (remain == 1) {
            System.out.println("cin zodyagi burcunuz Horoz");
        } else if (remain == 2) {
            System.out.println("cin zodyagi burcunuz Kopek");
        } else if (remain == 3) {
            System.out.println("cin zodyagi burcunuz Domuz");
        }else if (remain == 4) {
            System.out.println("cin zodyagi burcunuz Fare");
        }else if (remain == 5) {
            System.out.println("cin zodyagi burcunuz Okuz");
        }else if (remain == 6) {
            System.out.println("cin zodyagi burcunuz Kaplan");
        }else if (remain == 7) {
            System.out.println("cin zodyagi burcunuz Tavsan");
        }else if (remain == 8) {
            System.out.println("cin zodyagi burcunuz Ejderha");
        }else if (remain == 9) {
            System.out.println("cin zodyagi burcunuz Yilan");
        }else if (remain == 10) {
            System.out.println("cin zodyagi burcunuz At");
        }
        else {
            System.out.println("Cin zodyagi burcunuz koyun");
        }
    }
}
