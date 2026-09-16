
import java.util.Scanner;

public class CGPAPer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter grade point for subject " + i + ": ");
            double grade = sc.nextDouble();

            sum = sum + grade;
        }

        double cgpa = sum / n;
        double percentage = cgpa * 9.5;

        System.out.println("\nCGPA = " + cgpa);
        System.out.println("Percentage = " + percentage + "%");

        sc.close();
    }
}