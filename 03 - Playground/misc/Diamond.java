import java.util.Scanner;

public class Diamond {

    static void printRow(int i, int nrows) {
        for (int s = 1; s <= nrows - i; s++) {
            System.out.print(" ");
        }

        for (int s = 1; s <= i; s++) {
            System.out.print("* ");
        }
        System.out.println();
    } 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input number of initial rows: ");
        int nrows = input.nextInt();

        for (int i = 1; i <= nrows; i++) {
            printRow(i, nrows);
        }

        for (int i = nrows - 1; i >= 1; i--) {
            printRow(i, nrows);
        }

        input.close();
    }    
}
