import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = input.nextDouble();

        System.out.print("Enter y: ");
        double y = input.nextDouble();
        
        Point point = new Point(x, y);

        point.printCoordinates();
        System.out.println(String.format("%.2f", point.calculateDistance()));

        input.close();
    }
}
