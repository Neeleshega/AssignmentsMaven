package assignments;

public class Assignment13_PrimeNumber {

	public static void main(String[] args) {

        int n =25;
        int num = 0;

        if (n <= 1) {
            System.out.println(n + " is not prime number.");
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    num++;
                }
            }

            if (num == 0) {
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is not a prime number.");
            }
            
//            if (num > 0) {
//                System.out.println(n + " is not a prime number.");
//            } else {
//                System.out.println(n + " is a prime number.");
//            }
        }
    }
}
