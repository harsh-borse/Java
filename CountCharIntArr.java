import java.util.Scanner;

public class CountCharIntArr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int others = 0;

        for (char ch : arr) {

            if (Character.isLetter(ch)) {
                letters++;
            }
            else if (Character.isDigit(ch)) {
                numbers++;
            }
            else if (ch == ' ') {
                spaces++;
            }
            else {
                others++;
            }
        }

        System.out.println("Letters = " + letters);
        System.out.println("Spaces = " + spaces);
        System.out.println("Numbers = " + numbers);
        System.out.println("Other Characters = " + others);
    }
}