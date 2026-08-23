import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int principal = 0;
        int secondary = 0;

        for (int i = 0; i < n; i++) {
            principal += matrix[i][i];
        }

        for (int i = 0; i < n; i++) {
            secondary += matrix[i][n - 1 - i];
        }

        System.out.println("Principal diagonal sum = " + principal);
        System.out.println("Secondary diagonal sum = " + secondary);
        System.out.println("Total = " + (principal + secondary));
    }
}