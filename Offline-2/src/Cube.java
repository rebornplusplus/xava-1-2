class Cube extends Square {
    private static int totalCubes = 0;

    Cube(double sideLength) {
        super(sideLength, "Cube" + (++totalCubes));
    }

    public double volume() {
        return sideLength * baseArea();
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Volume: " + precision4(volume()) + "\n";
    }
}