import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double sum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number "+ i + ": ");
            double num = sc.nextDouble();

            sum = sum + num;
        }

        double average = sum / 5;

        System.out.println("Average = " + average);

    
    }
}