// Practice Challenge 3 
// Caesar Cipher

import java.util.Scanner;

public class CaesarCipher {

    // Just dump everything in this function
    static void showDecryptedText(String text) {
        
        char [] textChars = text.toCharArray();

        int shift = 0;

        // Can use concatenation or inserting into an array instead, 
        //     but StringBuilder is more efficient
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < textChars.length; i++) {
            char c = textChars[i];
            // Accounts for spaces
            if (c == ' ') {
                result.append(c);
            } else if (i == 0 || textChars[i-1] == ' ') {

                // Accounts for inputs that dont follow format
                if (!Character.isDigit(c)) {
                    System.out.print("Invalid text! Every first character must be a digit");
                    return;
                }
                shift = Character.getNumericValue(c);
            } else if (Character.isLetter(c)) {
                char base;
                if (Character.isUpperCase(c)) {
                    base = 'A';
                } else {
                    base = 'a';
                }
                // Handles looping logic pag over ang shift
                result.append((char) (((c - base - shift + 26) % 26) + base));
            } else {
                // If may symbols or non letters
                result.append(c);
            };
        }
        System.out.println(result.toString());

        return;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter cipher: ");
        String text = input.nextLine();

        showDecryptedText(text);

        input.close();
    }
}
