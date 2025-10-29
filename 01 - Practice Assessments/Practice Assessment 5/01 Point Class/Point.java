public class Point {

    private double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    } // i like using this keyword

    double calculateDistance() {
        return (double) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    void printCoordinates() {
        System.out.println(String.format("(%.0f,%.0f)", x, y));
    }
}
