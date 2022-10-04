import java.util.Scanner;

public class ATMwithCase {

        public static void main(String[] args) {
            String userName, password;
            Scanner input = new Scanner(System.in);
            int right = 3;
            int balance = 1500;
            int select;
            while (right > 0) {
                System.out.print("Kullanici adi : ");
                userName = input.nextLine();
                System.out.print("Password : ");
                password = input.nextLine();

                if (userName.equals("patika") && password.equals("dev123")){
                    System.out.println("Merhaba Kodluyoruz bankasina hosgeldiniz!");
                    do {
                        System.out.println("1-Para yatirma\n" +
                                "2-Para Cekme\n" +
                                "3-Bakiye Sorgula\n" +
                                "4-Cikis Yap");
                        System.out.print("Lutfen yapmak istediginiz islemi seciniz : ");
                        select = input.nextInt();
                        switch (select) {
                            case 1:
                                System.out.print("Para miktari : ");
                                int deposit = input.nextInt();
                                balance += deposit;
                                break;
                            case 2:
                                System.out.print("cekilecek Miktar : ");
                                int withdraw = input.nextInt();
                                if (withdraw > balance) {
                                    System.out.println("bakiye yetersiz!");
                                } else {
                                    balance -= withdraw;
                                }
                                break;
                            case 3:
                                System.out.println("bakiyeniz : " + balance);
                                break;
                            case 4:
                                System.out.println("Tekrar gorusmek uzere.");
                                break;
                        }
                    } while (select != 4);

                    break;
                } else {
                    right--;
                    System.out.println("hatali kullanaici adi veya parola, tekrar deneyin");
                    if (right == 0){
                        System.out.println("Hesabiniz bloke olmustur bankayi arayin");
                    } else {
                        System.out.println("kalan hakkiniz " + right);
                    }
                }
            }

        }
    }

