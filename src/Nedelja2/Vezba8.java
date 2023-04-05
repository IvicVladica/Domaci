package Nedelja2;//napravi novu fju
//unesi element
//proveri da li je element u nizu
//ako jeste ispisi element je u nizu

import java.util.Scanner;

public class Vezba8 {
    public static void provera(int x){
        int [] niz1 = {3234,12,124,6,126,2,22,661};
        for (int element : niz1) {
            if (element == x) {
                System.out.println("Element je u nizu");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Unesite broj: ");
        Scanner sc = new Scanner(System.in);
        int unos = sc.nextInt();
        provera(unos);
    }
}
