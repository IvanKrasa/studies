package studies.geometrys.figures;

public class Square {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public static void printSqureArea(Square s) {
        String text = String.format("Площадь квадрата со стороной %f = %f", s.side, s.area());
        System.out.println(text);

    }

    public double area() {
        return this.side * this.side;
    }

    public double perimetr() {
        return 4 * this.side;
    }
}
