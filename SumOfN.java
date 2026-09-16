import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int sum = 0;

       // System.out.println("Enter " + n + " numbers:");

        for (int i = 5; i <= n; i++) {
           // int num = sc.nextInt();
            sum = sum + i;
        

       
        sc.close();
    }
     System.out.println("Sum = " + sum);

}
}