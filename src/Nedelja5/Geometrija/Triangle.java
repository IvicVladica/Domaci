package Nedelja5.Geometrija;

public class Triangle extends Shape{
    double a;
    double b;
    double c;


    public Triangle(Coordinates startCoordinates, double a, double b, double c) {
        super(startCoordinates, 10,10);
        this.a = a;
        this.b = b;
        this.c = c;

    }
    public double getArea(){
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));

    }
}
