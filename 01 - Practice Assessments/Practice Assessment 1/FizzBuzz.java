import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an upper bound: ");
        int upperbd = input.nextInt();

        for (int i = 1; i <= upperbd; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        input.close();
    }
}
