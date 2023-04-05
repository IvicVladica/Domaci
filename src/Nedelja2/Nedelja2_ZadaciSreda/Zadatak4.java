package Nedelja2.Nedelja2_ZadaciSreda;//4. Написати функцију која ИСПИСУЈЕ да ли је број мањи, једнак или већи од другог броја
//        compareNums(5,4) -> Број је већи од другог броја
//        compareNums(5,5) -> Број је исти као и други број
//        compareNums(5,88) -> Број је мањи од другог броја


import java.util.Scanner;

public class Zadatak4 {

    public static void compareNums (int n1, int n2){
      if (n1 == n2) {
          System.out.println("Broj je isti kao i drugi broj");
        }
      else {
          if (n1 < n2) {
              System.out.println("Broj je manji od drugog broja");
          }
          else {
              System.out.println("Broj je veci od drugog broja");
          }
      }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite dva broja ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        compareNums(x,y);
    }
}
