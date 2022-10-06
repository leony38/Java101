import java.util.Scanner;

public class Calculator {

    static int sum (int a, int b){
        int result = a + b;
        System.out.println("Toplam : "+ result);
        return result;
    }
    static int minus( int a, int b){
        int result = a - b;
        System.out.println("Cikarma : "+ result);
        return result;
    }

    static int times(int a, int b){
        int result = a * b;
        System.out.println("Carpma : " + result);
        return result;
    }

    static int divided (int a, int b){
        if (b == 0){
            System.out.println("Ikinci sayi 0'dan farkli olmaildir");
            return 0;
        }
        int result = a / b;
        System.out.println("Bolme : " + result);
        return result;
    }
    static int power ( int a, int b){
        int result = 1;
        for (int i =1; i <= b; i++){
            result *= a;
        }
        return result;
    }
    static int mod(int a, int b){
        return a % 10;
    }
    static void calc (int a, int b){
        System.out.println("cevresi : " + 2 *(a + b));
        System.out.println("Alani : " + a * b);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1- Toplama Islemi\n" +
                "2- Cikarma islemi\n" +
                "3- Carpma islemi\n" +
                "4- Bolme Islemi\n" +
                "5- Uslu Sayi hesaplama\n" +
                "6- Mod alma\n" +
                "7- Dikdortgen Alan ve cevre hesaplama\n" +
                "8- Cikis";
        while (true){
            System.out.println(menu);
            System.out.print("Bir islem secin : ");
            select = input.nextInt();

            if (select == 0 ) {
                break;
            }
            System.out.print("Ilk sayi girin : ");
            int a = input.nextInt();
            System.out.print("Ikinci sayi girin :");
            int b = input.nextInt();

            switch (select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divided(a,b);
                    break;
                case 5:
                    System.out.println("Us alma : " + power(a,b));
                case 6:
                    System.out.println("Mod islemi : " + mod(a,b));
                    break;
                case 7:
                    calc(a,b);
                    break;

            }
            }
        System.out.println("Gule gule.");
        }

    }

