package Test1;//5. (10п) Написати функцију која враћа прослеђен низ целих бројева, али без дупликата
//        Напомена: Редослед није важан
//        Помоћ: Функција која тражи да ли се неки елемент налази у низу
//        int[] arr = { 1, 1, 2, 3, 3, 4, 5, 2, 8, 90, 8 };
//        removeDuplicates(arr); // Враћа [1, 2, 3, 4, 5, 8, 90]

import java.util.Arrays;

public class Zadatak5 {
    public static int [] removeDuplicates(int []arr){
        for (int i=0; i<arr.length; i++){
            int x = arr[i];
            for (int k=1; k<arr.length; k++){
                if (x == arr[k]) {
                    arr[k]=0;
                }
            }
            }
        return arr;
        }

    public static void main(String[] args) {
        int niz[] = {1, 1, 2, 3, 3, 4, 5, 2, 8, 90, 8};
        int niz1[] = removeDuplicates(niz);
        System.out.println(Arrays.toString(niz1));
    }
    }

