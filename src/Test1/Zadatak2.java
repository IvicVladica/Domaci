package Test1;//2. (25п) Написати функцију која враћа производ бројева између N и M (укључујући оба)
//        Лакша верзија: Претпоставити да је N увек мање од M
//        productRange(3, 7); // Враћа 2520 (Јер је 3 * 4 * 5 * 6 * 7 = 2520)
//        productRange(5, 3); // Враћа 60 (Јер је 3 * 4 * 5 = 60)

public class Zadatak2 {

    public static int proizvod(int x, int y){
        if (x>y) {
            int temp = x;
            x = y;
            y = temp;
        }
        int sum = 1;
        for (int i=x; i<=y; i++) {
            sum = sum * i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int a=7;
        int b=3;
        System.out.println(proizvod(a,b));
    }
}


