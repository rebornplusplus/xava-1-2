abstract class Shape implements Area, Volume, Utility {
    protected String name;

    Shape() {
        this.name = "Unspecified";
    }

    Shape(String name) {
        this.name = name;
    }
}