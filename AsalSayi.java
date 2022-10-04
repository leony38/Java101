public class AsalSayi {
    public static void main(String[] args) {
        int result;

        for (int i =1; i <= 100; i++){
            int counter = 0;
            for (int k = 1; k <= i; k++){
                result = i % k;
                if (result == 0){
                    counter++;
                }
            }
            if (counter == 2){
                System.out.print(i + ",");
            }
        }

    }
}
