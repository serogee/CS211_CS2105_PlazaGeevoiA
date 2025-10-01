import java.util.Scanner;

public class AptxVault {

    static int [] getPasscodes() {
        Scanner input = new Scanner(System.in);

        int [] passcodes = new int [3];
        
        for (int i = 0; i < passcodes.length; i++) {
            System.out.printf("Enter passcode %d: ", i + 1);
            passcodes[i] = input.nextInt();
        }
        
        input.close();
        
        return passcodes;
    };

    static int sum(int[] passcodes) {
        int sum = 0;
        for (int passcode : passcodes) {
            sum += passcode;
        }

        return sum;
    }

    static boolean isValidPasscodes(int[] passcodes) {
        for (int passcode : passcodes) {
            if (passcode < 450 || passcode > 3000) {
                return false;
            }
        }
        return (sum(passcodes) == 4869);
    }

    public static void main(String[] args) {

        int [] passcodes = getPasscodes();

        if (isValidPasscodes(passcodes)) {
           
            System.out.print("Vault unlocked with: ");
            for (int i = 0; i < passcodes.length; i++) {
                System.out.print(passcodes[i]);
                if (i < passcodes.length - 1) {
                    System.out.print(", ");
                };
            } 
        } else {
            System.out.println("Vault remains locked.");
        }
        
    }
}
