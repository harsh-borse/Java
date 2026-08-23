import java.util.Scanner;

public class Prime2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        System.out.println("Prime numbers between 2 and " + n + " are:");

        for (int i = 2; i <= n; i++) {

            int count = 0;

            // Check whether i is prime
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            // A prime number has exactly 2 factors
            if (count == 2) {
                System.out.print(i + " ");
                sum = sum + i;
            }
        }

        System.out.println("\nAddition of all prime numbers = " + sum);
    }
}
