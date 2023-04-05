package Test1;//3. (25п) Написати програм који исписује следећу структуру у зависности од уноса ширине и висине:
//        Напомене:
//        Ширина (W) ће увек бити 3 или веће
//        Приметити разлику у зависности од парне или непарне висине (H)


import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite sirinu: ");
        int x = sc.nextInt();
        System.out.println("Unesite visinu: ");
        int y = sc.nextInt();
        System.out.println(" ".repeat(x) + "#".repeat(x-2));
        for (int i=1; i<y-1; i++){
            System.out.println(" ".repeat(x-1) + "#" + " ".repeat(x-2) + "#");
        }
        System.out.println(" ".repeat(x) + "#".repeat(x-2));
        }

    }

