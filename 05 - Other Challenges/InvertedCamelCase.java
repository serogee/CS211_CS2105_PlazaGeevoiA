import java.util.Scanner;

public class InvertedCamelCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter string in CamelCase: ");
        String text = input.nextLine();

        for (char c : text.toCharArray()) {
            if (Character.isLowerCase(c)) {
                System.out.print(Character.toUpperCase(c));
            } else {
                System.out.printf(" %c", Character.toLowerCase(c));
            }
        }

        input.close();
    }
}
