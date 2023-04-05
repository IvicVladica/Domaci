package Nedelja4;//Написати функцију која враћа прослеђен низ целих бројева, али без дупликата
//        Напомена: Редослед није важан
//        Помоћ: Функција која тражи да ли се неки елемент налази у низу
//        int[] arr = { 1, 1, 2, 3, 3, 4, 5, 2, 8, 90, 8 };
//        removeDuplicates(arr); // Враћа [1, 2, 3, 4, 5, 8, 90]


import java.util.Arrays;
import java.util.HashSet;

public class Vezba1 {
    public static int[] removeDuplicates (int[] input){
        HashSet<Integer> sorted = new HashSet<>();
        for (int i = 0; i<input.length; i++) {
            sorted.add(input[i]);
        }
        int [] result = new int[sorted.size()];
        int i=0;
        for (var el : sorted){
            result[i] = el;
            i++;

        }
        return result;
    }

    public static void main(String[] args) {
        int[] niz = {1,1,2,2,2,3,4,4,5,1,2};
        System.out.println(Arrays.toString(removeDuplicates(niz)));
    }
}
