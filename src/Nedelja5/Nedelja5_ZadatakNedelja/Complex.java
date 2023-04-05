//3. Napisati klasu Complex koja predstavlja kompleksni broj. Kompleksni broj se karakteriše realnim i
//        imaginarnim delom.
//        Implementirati sledeće metode:
//        • double getReal(), vraća vrednost realnog dela
//        • double getImag(), vraća vrednost imaginarnog dela
//        • Complex add(Complex t), vraća vrednost zbira dva kompleksna broja
//        • Complex subtract(Complex t), vraća vrednost razlike dva kompleksna broja
//        • Complex multiply(Complex t), vraća vrednost proizvoda dva kompleksna broja
//        • Complex divide(Complex t), vraća vrednost količnika dva kompleksna broja
//        Obezbediti implementaciju funkcije String toString() koja kompleksni broj prikazuje kao u primeru:
//
//        > 2 + 3i
//        > 2 - 4i
//        > 1
//        > 4i

package Nedelja5.Nedelja5_ZadatakNedelja;

public class Complex {
    double real;
    double imag;


    public Complex (double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public double getImag() {
        return imag;
    }
    public double getReal() {
        return real;
    }

    public Complex subtract (Complex n) {
        return new Complex(this.getReal()-n.getReal(), this.getImag()-n.getImag());
    }

    public Complex add (Complex n) {
        return new Complex(this.getReal()+n.getReal(), this.getImag()+n.getImag());
    }
    static Complex addS (Complex a, Complex b) {                                        // isprobavanje Static metode
        return new Complex(a.getReal()+b.getReal(), a.getImag()+b.getImag());
    }
    public Complex multiply (Complex n) {
        double a = this.getReal()*n.getReal() - this.getImag()*n.getImag();
        double b = this.getReal()*n.getImag() + this.getImag()*n.getReal();
        return new Complex(a,b);
    }
    public Complex divide (Complex n) {
        double brojilac = (n.getReal()*n.getReal() + n.getImag()*n.getImag());
        double a = ((this.getReal()*n.getReal() + this.getImag()*n.getImag())/brojilac);
        double b = ((this.getReal()*(-n.getImag()) + this.getImag()*n.getReal())/brojilac);
        return new Complex(a,b);
    }

    @Override
    public String toString() {
        if (imag < 0) {
            return (real + " - " + Math.abs(imag) + "i");
        }
        if (imag == 0) {
            return (real + "");
        }
        if (real == 0) {
            return (imag + "i");
        }
        else return (real + " + " + imag + "i");
    }
}
