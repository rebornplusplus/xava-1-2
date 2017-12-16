interface Area {
    default double baseArea() {
        return 0;
    }

    default double surfaceArea() {
        return 0;
    }
}

interface Volume {
    default double volume() {
        return 0;
    }
}

interface Utility {
    default String precision4(double d) {
        return String.format("%.4f", d);
    }
}