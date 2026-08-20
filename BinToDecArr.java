 import java.util.Scanner;

public class BinToDecArr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        int binary = sc.nextInt();

        int[] digits = new int[32];
        int i = 0;

        // Store binary digits in array
        while (binary > 0) {
            digits[i] = binary % 10;
            binary = binary / 10;
            i++;
        }

        int decimal = 0;
        int base = 1;

        // Convert binary to decimal
        for (int j = 0; j < i; j++) {
            decimal = decimal + digits[j] * base;
            base = base * 2;
        }

        System.out.println("Decimal number = " + decimal);

    
    }
} 
    

