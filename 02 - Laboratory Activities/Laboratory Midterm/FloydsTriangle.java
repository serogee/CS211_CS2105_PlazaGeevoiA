import java.util.Scanner; // #1

public class FloydsTriangle { // #2
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in); // #3

        System.out.print("Enter the number of rows (1 to 20): ");
        int rows = value.nextInt(); // #4

        // Constraint check
        if (rows < 1 || rows > 20) { // #5
            System.out.println("Enter a number between 1 and 20.");
        } else {
            System.out.println("Floyd's Triangle with " + rows + " rows:");

            for (int i = 1; i <= rows; i++) { // #6
                for (int j = 1; j <= i; j++) { // #7
                    int num = i * (i - 1) / 2 + j; // #8
                    System.out.printf("%-4s", num);
                }
                System.out.println(); // #9 
            }
        }

        value.close(); // #10
    }
}

