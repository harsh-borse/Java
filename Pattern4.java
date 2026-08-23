
public class Pattern4 {
    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {

            // Print spaces
            for (int space = 1; space < i; space++) {
                System.out.print("  ");
            }

            // Print numbers
            for (int j = i; j <= 5; j++) {
                System.out.print(j + "   ");
            }

            System.out.println();
        }
    }
}