class Circle extends Shape {
    private static int totalCircle = 0;
    protected double radius;

    Circle(double r) {
        super("Circle" + (++totalCircle));
        radius = r;
    }

    Circle(double r, String name) {
        super(name);
        radius = r;
    }

    public double baseArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Area: " + precision4(baseArea()) + "\n";
    }
}