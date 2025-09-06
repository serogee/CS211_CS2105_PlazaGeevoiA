import java.util.Scanner;

public class Fibonacci {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int num = input.nextInt();

        int a = 0, b = 1;

        System.out.print("Fibonacci Series:");
        
        for (int i = 0; i < num; i++) {
            System.out.print(" ");
            if (i == 0 || i == 1) {
                System.out.print(i);
            } else {
                int next = a + b;
                System.out.print(next);
                a = b;
                b = next;
            }
        }


        input.close();
    }
}
