
class Number {

    void evenNumbers() {
        System.out.println("Even Numbers:");

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    void oddNumbers() {
        System.out.println("\nOdd Numbers:");

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
}

class NumberTest extends Number{
}
    public class EvenOdd {
    public static void main(String[] args) {
        NumberTest obj = new NumberTest();

        obj.evenNumbers();
        obj.oddNumbers();
    }
} 
    

