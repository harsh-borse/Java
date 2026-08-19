import java.util.*;
public class basic{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the first number:" );
        int a = sc.nextInt();
        System.out.print("Enter the second number:" );
        int b = sc.nextInt();

        System.out.println("Choose an Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        
        int ch = sc.nextInt();

        switch(ch) {
            case 1:
                System.out.println("The Sum of two numbers is: " + (a + b));
                break;
            case 2:
                System.out.println("The Subtraction of two numbers is: " + (a - b));
                break;
            case 3:
                System.out.println("The Multiplication of two numbers is: " + (a * b));
                break;
            case 4:
                if(b != 0) 
                    System.out.println("The Division of two numbers is: " + (a / b));
                else 
                    System.out.println("Error! Division by zero is not allowed.");
                break;
            case 5:
                if(b !=0)
                    System.out.println("The Modulus of two numbers is: " + (a % b));
                else 
                    System.out.println("Error! Modulus by zero is not allowed.");
                break;
            default:
                System.out.println("Invalid choice!");
        }

    }
}