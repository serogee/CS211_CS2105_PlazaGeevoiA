import java.util.Scanner;

public class SuperDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (up to 18 digits): ");
        String numberStr = input.nextLine();

        // Constraint: Check if the number 
        // exceeds 18 digits or is invalid
        if (!numberStr.matches("\\d+") || numberStr.length() > 18) { // #2
            System.out.println("Enter a positive integer up to 18 digits only.");
            return;
        }

        long number = Long.parseLong(numberStr);

        // Call the function to compute the super digit
        int superDigit = findSuperDigit(number); // #3

        System.out.println("Super digit of " + number + ": " + superDigit); // #4

        input.close(); // #5
    }

     public static int findSuperDigit(long num) {
        if (num < 10) { // #6
            return (int) num; 
           // Base case: single-digit number
        }

        long sum = 0;
        while (num > 0) {
            sum += (num % 10); // #9 Add last digit
            num /= 10;         // Remove last digit
        }

        // Recursively compute the super digit of the sum
        return findSuperDigit(sum); // #10 
    }
}

