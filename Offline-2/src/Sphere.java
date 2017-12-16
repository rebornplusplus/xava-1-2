class Sphere extends Circle {
    private static int totalSpheres = 0;

    Sphere(double r) {
        super(r, "Sphere" + (++totalSpheres));
    }

    public double volume() {
        return 4.0 * radius / 3.0 * baseArea();
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Volume: " + precision4(volume()) + "\n";
    }
}