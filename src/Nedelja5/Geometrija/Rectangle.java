package Nedelja5.Geometrija;

public class Rectangle extends Shape {

    public Rectangle(Coordinates startCoordinates, double height, double width) {
        super(startCoordinates, height, width);

    }
    public double getArea() {
        return height * width;
    }
}
