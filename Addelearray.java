package Arrays;
import java.util.Scanner;

public class Addelearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the size of the array and initialize it
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Get the new element and the position to insert it
        System.out.print("Enter the new element to add: ");
        int newElement = sc.nextInt();
        System.out.print("Enter the position to insert the new element (0-based index): ");
        int position = sc.nextInt();

        // Insert the new element at the specified position
        int[] newArr = insertElement(arr, newElement, position);

        // Display the new array
        System.out.println("The array after adding the new element:");
        for (int i : newArr) {
            System.out.print(i + " ");
        }
        sc.close();
    }

    // Method to insert an element at a specified position
    public static int[] insertElement(int[] arr, int element, int position) {
        int n = arr.length;
        int[] newArr = new int[n + 1];

        // Copy elements before the position
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        // Insert the new element
        newArr[position] = element;

        // Copy elements after the position
        for (int i = position; i < n; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr;
    }
}
