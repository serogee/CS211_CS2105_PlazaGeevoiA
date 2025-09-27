// Practice Challenge 2 
// Floyd's Triangle
// [Variation: Consistent Spacing]

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int nrows = input.nextInt();
        int num = 1;

        System.out.println("\nFloyd's Triangle with " + nrows + " rows:");

        for (int i = 0; i < nrows; i++) {
            for (int n = 0; n <= i; n++) {
                // "%-" : left align
                // "4"  : length
                System.out.print(String.format("%-4s", num));
                num++;
            }
            System.out.println();
        }

        input.close();
    }
}
