package studies.geometrys.figures;

public class Square {
    public static void printSqureArea(double side) {
        String text = String.format("Площадь квадрата со стороной %f = %f", side, squareArea(side));
        System.out.println(text);

    }

    private static double squareArea(double a) {
        return a * a;
    }
}
