public class PalindromSayilar {
    static  boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber;
        while(temp != 0){
            System.out.println("==========");
            System.out.println("Sayi => " + temp);
            lastNumber = temp % 10;
            System.out.println("Son basamak => " + lastNumber);
            reverseNumber = (reverseNumber * 10) + lastNumber;
            System.out.println("yeni sayi => " + reverseNumber );
            temp /= 10;
            System.out.println("yeni temp => " + temp);
        }
        if (number == reverseNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(9889));
        // 7 * 10 = 70 + 4 =74
        // 74 * 10 = 740 + 2 = 742
    }
}
