import java.util.Scanner;
public class DecToBin{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();

        String binary = "";
        while(num > 0){
            int remainder = num % 2;
            binary = binary + remainder;
            num = num / 2;
        }
        System.out.println("Binary representation: " + binary);
    }
}