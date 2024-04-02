// Interface Shape3D
interface Shape3D {
    double getVolume();
}

// Class Cuboid
class Cuboid implements Shape3D {
    private double length;
    private double height;
    private double breadth;

    public Cuboid(double length, double height, double breadth) {
        this.length = length;
        this.height = height;
        this.breadth = breadth;
    }

    @Override
    public double getVolume() {
        return length * height * breadth;
    }
}

// Interface Solid3D
interface Solid3D extends Shape3D {
    double getDensity();
    double getMass();
}

// Class SolidCuboid
class SolidCuboid extends Cuboid implements Solid3D {
    private double density;

    public SolidCuboid(double length, double height, double breadth) {
        this(length, height, breadth, 1.0);
    }

    public SolidCuboid(double length, double height, double breadth, double density) {
        super(length, height, breadth);
        this.density = density;
    }

    @Override
    public double getDensity() {
        return density;
    }

    @Override
    public double getMass() {
        return getVolume() * density;
    }
}
public class shape_8 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid(2.0, 3.0, 4.0);
        System.out.println("Cuboid Volume: " + cuboid.getVolume());

        SolidCuboid solidCuboid = new SolidCuboid(2.0, 3.0, 4.0, 5.0);
        System.out.println("SolidCuboid Volume: " + solidCuboid.getVolume());
        System.out.println("SolidCuboid Density: " + solidCuboid.getDensity());
        System.out.println("SolidCuboid Mass: " + solidCuboid.getMass());
    }
}
