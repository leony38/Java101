import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String userName, password, select;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanici adi girin : ");
        userName = input.nextLine();
        System.out.print("Password girin : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giris yaptiniz! ");
        } else {
            System.out.println("Bilgileriniz yanlis!");
            System.out.print("Sifrenizi sifirlamak istermisiniz? Yes/No :");
            select = input.nextLine();
            if (select.equals("Yes")){
                System.out.print("yeni sifrenizi belirleyiniz. Yeni  şifreniniz hatalı girdiğiniz veya unuttuğunuz şifre ile aynı olmamalı. ");
                System.out.print("yeni sifre : ");
                password = input.nextLine();
                if (password.equals("java123")) {
                    System.out.print("Sifre olusturulmadi, Lutfen yeni sifre girin :");

                }else {
                    System.out.println("Yeni sifre olusturuldu.");
                }
            }
            else {
                System.out.print("Sifre yenilenemedi");
            }
        }
    }
}
