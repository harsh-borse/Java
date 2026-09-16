import java.util.Scanner;

public class CompInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter Principal Amount: ");
        double P = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double R = sc.nextDouble();

        System.out.print("Enter Time in Years: ");
        double T = sc.nextDouble();

        // Calculate amount
        double A = P * Math.pow((1 + R / 100), T);

        // Calculate compound interest
        double CI = A - P;

        // Display result
        System.out.println("Compound Interest = " + CI);
        System.out.println("Final Amount = " + A);

        sc.close();
    }
}