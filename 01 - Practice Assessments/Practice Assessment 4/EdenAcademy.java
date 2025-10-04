import java.util.Scanner;

public class EdenAcademy {

    static int roundGrade(int grade) {
        if (grade % 5 >= 3) {
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
        System.out.print("Enter grades:");
        
        int[] passed = new int[n];
        int[] failed = new int[n];
        int passCount = 0, failCount = 0;

        for (int i = 0; i < n; i++) {
            System.out.print(" ");
            int grade = input.nextInt();
            grades[i] = grade;

            if (isPassingGrade(grade)) {
                passed[passCount++] = roundGrade(grade);
            } else {
                failed[failCount++] = grade;
            }
        }

        System.out.println();

        System.out.print("Passed:");
        if (passCount > 0) {
            for (int i = 0; i < passCount; i++) {
                System.out.print(String.format(" %d", passed[i]));
            }
        }
        System.out.print("\nFailed:");
        if (passCount > 0) {
            for (int i = 0; i < failCount; i++) {
                System.out.print(String.format(" %d", failed[i]));
            }
        }
        System.out.println("\n");
        
        System.out.println("Stella Stars: " + (passCount / 3));
        System.out.println("Tonitrus Bolts: " + failCount);

        input.close();
    }
}
