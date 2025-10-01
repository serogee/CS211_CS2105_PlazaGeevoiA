import java.util.Scanner;

public class CoffeePoirot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Coffee Poirot, Beika City!");
        System.out.println("Please choose from out menu:");

        String [] menuItems = {"Coffee", "Tea", "Smoothie"};
        String [] menuItemDescriptions = {"Bitter but energizing!", "Soothing and calming!", "Cold and refreshing!"};
        int exitIndex = menuItems.length + 1;

        int [] orders = new int [100];
        int ctr = 0;
        int choice = 0;

        for (int i = 1; i < exitIndex; i++) {
            System.out.println(String.format("%d - %s", i, menuItems[i-1]));
        }
        System.out.println(String.format("%d - Exit (Checkout)\n", exitIndex));

        do {
            System.out.print("Enter your beverage: ");

            choice = input.nextInt();

            if (choice < exitIndex && choice > 0) {
                orders[ctr] = choice;
                ctr++;
            } else if (choice != exitIndex) {
                System.out.println("Invalid Choice, please try again.");
                continue;
            }

        
        } while (choice != exitIndex);

        System.out.println();

        for (int i = 0; i < ctr; i++) {
            System.out.println(menuItemDescriptions[orders[i]-1]);
        };

        System.out.println("\nThank you for visiting Coffee Poirot!");


        input.close();

    }

    
}
