
public class Pattern3{
    public static void main(String[] args) {

        // Upper half
        for (int i = 1; i <= 3; i++) {

            for (int space = 1; space <= 3 - i; space++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*   ");
            }

            System.out.println();
        }

        // Lower half
        for (int i = 2; i >= 1; i--) {

            for (int space = 1; space <= 3 - i; space++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*   ");
            }

            System.out.println();
        }
    }
}