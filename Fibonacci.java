public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n = 5, n3;

        // Print the first two Fibonacci numbers
        System.out.print(n1 + " " + n2 + " ");

        for (int i = 2; i <= n; i++) {  // Start from 2 because the first two numbers are already printed
            n3 = n1 + n2;  // Calculate the next Fibonacci number
            System.out.print(n3 + " ");  // Print the next Fibonacci number
            n1 = n2;  // Update n1 to n2
            n2 = n3;  // Update n2 to n3
        }
    }
}
