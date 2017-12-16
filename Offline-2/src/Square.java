class Square extends Shape {
    private static int totalSquares = 0;
    protected double sideLength;

    Square(double sideLength) {
        super("Square" + (++totalSquares));
        this.sideLength = sideLength;
    }

    Square(double sideLength, String name) {
        super(name);
        this.sideLength = sideLength;
    }

    public double baseArea() {
        return sideLength * sideLength;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Area: " + precision4(baseArea()) + "\n";
    }
}