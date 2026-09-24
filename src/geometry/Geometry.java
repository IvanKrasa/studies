package geometry;

public class Geometry {
    public static void main(String[] args) {
        printSqureArea(7.0);
        printSqureArea(5.0);
        printSqureArea(3.0);

        printReactangleArea(3.0, 5.0);
        printReactangleArea(7.0, 9.0);
    }

    private static void printReactangleArea(double a, double b) {
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + rectangleArea(a,b));
    }

    private static double rectangleArea(double a, double b) {
        return a * b;
    }

    static void printSqureArea(double side) {
        System.out.println("Площадь квадрата со стороной " + side + " = " + squareArea(side));

    }

    private static double squareArea(double a) {
        return a * a;
    }
}
