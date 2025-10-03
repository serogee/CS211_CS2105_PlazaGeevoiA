import java.util.Scanner;

public class EdenAcademy {

    static int calculateGrade(int grade) {
        if (grade % 5 >= 3 && grade >= 78) {
            grade = grade + (5 - (grade % 5));
        } 
        return grade;
    }

    static boolean isPassingGrade(int grade) {
        return grade >= 78;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of grades: ");
        int n = input.nextInt();

        int[] grades = new int[n];
        System.out.print("\nEnter grades:");
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
            grades[i] = input.nextInt();
        }

        int[] passed;
        int stellaStar = 0;
        int tonitrusBold = 0;

        System.out.print("\n\nPassed:");
        


        
        input.close();
    }
}
