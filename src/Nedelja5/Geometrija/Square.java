package Nedelja5.Geometrija;

public class Square extends Shape{

    public Square(Coordinates startCoordinates, double height, double width) {
        super(startCoordinates, height, width);
    }
    public double getArea() {
        return Math.pow(height,2);
    }
}
