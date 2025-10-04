import java.util.Scanner;

public class LilycoveDepartmentStore {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter total: ");
        int total = input.nextInt();

        System.out.print("Your payment: ");
        int payment = input.nextInt();

        if (payment < total) {
            System.out.println("You don't have enough money.");
        } else if (payment == total) {
            System.out.println("Thank you for shopping!");
        } else {
            int[] bills = {1000, 500, 200, 100, 50};
            int[] coins = {20, 10, 5, 1};
            int change = payment - total;

            for (int x : bills) {
                int count = change / x;
                if (count > 0) {
                    System.out.println(String.format("%d %d-peso bill", count, x));
                }
                change %= x;
            }
            for (int x : coins) {
                int count = change / x;
                if (count > 0) {
                    System.out.println(String.format("%d %d-peso coin", count, x));
                }
                change %= x;
            }

        }
        
        input.close();
    }
}
