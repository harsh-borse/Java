
import java.util.Scanner;

public class SwapElem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] newArr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Copy arr into newArr
        for (int i = 0; i < n; i++) {
            newArr[i] = arr[i];
        }

        // Swap first and last elements
        int temp = newArr[0];
        newArr[0] = newArr[n - 1];
        newArr[n - 1] = temp;

        System.out.println("Original Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nNew Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}