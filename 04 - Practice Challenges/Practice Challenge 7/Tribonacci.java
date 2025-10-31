// Practice Challenge 7 
// Tribonacci Sequence

import java.util.Scanner;

public class Tribonacci {

    static int tribonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return (tribonacci(n - 3) + tribonacci(n - 2) + tribonacci(n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();
        int result = tribonacci(n);

        System.out.println(String.format("Element %d of the Tribonacci Sequence is %d.", n, result));

        input.close();
    }
}