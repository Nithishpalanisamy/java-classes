class Point {
    double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class Quadrilateral {
    Point p1, p2, p3, p4;

    Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }
}

class Trapezoid extends Quadrilateral {
    double height;

    Trapezoid(Point p1, Point p2, Point p3, Point p4, double height) {
        super(p1, p2, p3, p4);
        this.height = height;
    }

    double area() {
        double a_side = Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
        double b_side = Math.sqrt(Math.pow((p4.x - p3.x), 2) + Math.pow((p4.y - p3.y), 2));
        return 0.5 * (a_side + b_side) * height;
    }
}

class Parallelogram extends Quadrilateral {
    double width, height;

    Parallelogram(Point p1, Point p2, Point p3, Point p4, double width, double height) {
        super(p1, p2, p3, p4);
        this.width = width;
        this.height = height;
    }

    double area() {
        return width * height;
    }
}

class Rectangle extends Parallelogram {
    Rectangle(Point p1, Point p2, Point p3, Point p4, double width, double height) {
        super(p1, p2, p3, p4, width, height);
    }
}

class Square extends Rectangle {
    Square(Point p1, Point p2, Point p3, Point p4, double side) {
        super(p1, p2, p3, p4, side, side);
    }
}

public class Quad_7 {
    public static void main(String[] args) {
        Trapezoid trapezoid = new Trapezoid(new Point(0, 0), new Point(10, 0), new Point(8, 5), new Point(3.3, 5), 5);
        System.out.println("Area of Trapezoid: " + trapezoid.area());

        Parallelogram parallelogram = new Parallelogram(new Point(-5, -5), new Point(-11, -5), new Point(-12, 20), new Point(-6, 20), 6, 15);
        System.out.println("Area of Parallelogram: " + parallelogram.area());

        Rectangle rectangle = new Rectangle(new Point(-17, 14), new Point(-30, 14), new Point(-30, 28), new Point(-17, 28), 13, 14);
        System.out.println("Area of Rectangle: " + rectangle.area());

        Square square = new Square(new Point(-4, -4), new Point(-8, -4), new Point(-8, -8), new Point(-4, -8), 4);
        System.out.println("Area of Square: " + square.area());
    }
}
