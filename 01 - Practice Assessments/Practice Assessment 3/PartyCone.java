import java.util.Scanner;
import java.lang.Math;

public class PartyCone {

    static double getConeSurfaceArea(double radius, double height) {
        return (Math.PI*radius*(radius+Math.sqrt((height*height)+(radius*radius))));
    }

    static double getConeVolume(double radius, double height) {
        return (Math.PI*(radius*radius)*(height/3));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Diameter of the cone's base: ");
        double diameter = input.nextDouble();
        
        System.out.print("Height of the cone: ");
        double height = input.nextDouble();

        double radius = diameter / 2.0;

        double surfaceArea = getConeSurfaceArea(radius, height);
        double volume = getConeVolume(radius, height);

        System.out.println(String.format("Surface Area is %.4f", surfaceArea));
        System.out.println(String.format("Volume is %.4f", volume));

        input.close();
    }
}