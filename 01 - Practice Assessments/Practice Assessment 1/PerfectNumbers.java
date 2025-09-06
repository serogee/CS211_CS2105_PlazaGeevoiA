import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= (num / 2); i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (num > 0 && sum == num) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }

        input.close();
    }
}
