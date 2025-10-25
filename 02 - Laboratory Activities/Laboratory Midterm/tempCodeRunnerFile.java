import java.util.Scanner;

public class NaniwaHarukas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("WELCOME TO NANIWA HARUKAS!");
        System.out.println();

        System.out.print("Enter the first term (a1): ");
        int a1 = input.nextInt();
        
        System.out.print("Enter the common difference (d): ");
        int d = input.nextInt();
    
        System.out.print("Enter the number of terms (n): ");
        int n = input.nextInt();

        if (
            (a1 < 1 || a1 > 100) ||
            (d < 1 || d > 100) ||
            (n < 1 || n > 50)
        ) {
            return;
        }

        int[] terms = new int[n];
        for (int i = 1; i <= n; i++) {
            terms[i-1] = a1 + ((i - 1) * d);
        }
        int sum = (n * ((2 * a1) + ((n - 1) * d)) / 2);
        System.out.println();

        System.out.print("Arithmetic Sequence:");
        for (int term : terms) {
            System.out.print(" " + term);
        }

        System.out.println();

        if (sum == 60) {
            System.out.println("Sum of sequence = " + sum);
            System.out.println("Welcome to the Observation Deck.");
            System.out.println("\"It's a beautiful sunset, isn't it?\"");
        } else if (sum % 15 == 0) { // if sum is divisible by 3 and 5, then it is divisible by 15
            System.out.println("Sum of sequence = " + sum);
            System.out.println("Welcome to the Souvenir Shop.");
        } else if (sum % 3 == 0) {
            System.out.println("Sum of sequence = " + sum);
            System.out.println("Welcome to the Restaurant and Sky Garden.");
        } else {
            System.out.println("Sum of sequence = " + sum);
        } // Sum of sequence can be put before the conditional but written like this instead for the sake of the instruction

        input.close();
    }
}
