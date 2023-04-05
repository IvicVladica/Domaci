package Nedelja5.Geometrija;

public abstract class Shape {
    private Coordinates startCoordinates;
    protected double height;
    protected double width;
    public abstract double getArea();

    public Shape(Coordinates startCoordinates, double height, double width) {
        this.startCoordinates = startCoordinates;
        this.height = height;
        this.width = width;
    }

    public Coordinates getStartCoordinates() {
        return startCoordinates;
    }
}