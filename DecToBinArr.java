import java.util.Scanner;

public class DecToBinArr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();

        int[] binary = new int[32];
        int i = 0;

        while (num > 0) {
            binary[i] = num % 2;
            num = num / 2;
            i++;
        }

        System.out.print("Binary number = ");

        for (i = i - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }

    
    }
}

