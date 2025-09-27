import java.util.Scanner;

public class Sequences {

    static boolean isArithmetic(int[] seq, int diff) {
        for (int i = 0; i < (seq.length - 1); i++) {
            if ((seq[i+1] - seq[i]) != diff) {
                return false;
            }
        }
        return true;
    }
    
    static boolean isGeometric(int[] seq, double ratio) {
        for (int i = 0; i < (seq.length - 1); i++) {
            if ((double) (seq[i+1] / seq[i]) != ratio) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] seq = new int[5];

        System.out.print("Enter the first 5 elements of the sequence: ");
        for (int i = 0; i < 5; i++) {
            seq[i] = input.nextInt();
        } 

        int diff = seq[1] - seq[0];
        boolean isArithmetic = isArithmetic(seq, diff);
        
        double ratio = (double) seq[1] / seq[0];
        boolean isGeometric = isGeometric(seq, ratio);


        if (isArithmetic || isGeometric) {
            System.out.print("Find which element: ");
            int n = input.nextInt();

            if (isArithmetic) {
                int nth = seq[0] + ((n-1) * diff);
                System.out.println("Element " + n + " is " + nth);
            } else if (isGeometric) {
                double nthTerm = seq[0] * Math.pow(ratio, n - 1);
                System.out.println("Element " + n + " is " + (long) nthTerm);
            }

        } else {
            System.out.println("The sequence is neither arithmetic nor geometric.");
        };


        input.close();
    }
}