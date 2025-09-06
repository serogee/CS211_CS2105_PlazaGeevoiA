import java.util.Scanner;

public class SuperDigit {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer (up to 18 digits): ");

        String number = String.valueOf(input.nextInt());
        String result = number;

        while (result.length() > 1) {
            int sum = 0;
            for (int i = 0; i < result.length(); i++) {
                sum += (result.charAt(i) - '0');
            }
            result = String.valueOf(sum);
        } 

        System.out.println("Super Digit of " + number + ": " + result);

        input.close();
    }
}
