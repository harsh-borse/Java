import java.util.Scanner;

public class CountCharInt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int others = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                letters++;
            }
            else if (Character.isDigit(ch)) {
                numbers++;
            }
            else if (Character.isWhitespace(ch)) {
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