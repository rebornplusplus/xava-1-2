class Cylinder extends Circle {
    private static int totalCylinders = 0;
    private double height;

    Cylinder(double r, double h) {
        super(r, "Cylinder" + (++totalCylinders));
        height = h;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * height;
    }

    public double volume() {
        return baseArea() * height;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Area of the base: " + precision4(baseArea()) + "\n" +
                "Area of surface: " + precision4(surfaceArea()) + "\n" +
                "Volume: " + precision4(volume()) + "\n";
    }
}