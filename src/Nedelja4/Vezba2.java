package Nedelja4;//Колико у низу има дупликата:
//        1. Како год урадите океј је
//        2. Урадите помоћу Set-a
//        3. Урадите помоћу Set-a али без set.size и array.length
//Колико се пута који елемент понавља:
//        HashMap који има следећу структуру:
//        (1, 5)  (то значи да се број 1 понавља 5 пута)

import java.util.HashMap;
import java.util.HashSet;

public class Vezba2 {
    public static int DuplicateCount (int []arr){
        HashSet<Integer> arrSorted = new HashSet<>();
        int count=0;
        for (var el : arr){
            if (!arrSorted.add(el)) {count++;}
            arrSorted.add(el);
        }
        System.out.println(count);
        return arr.length - arrSorted.size();
    }

    public static HashMap<Integer,Integer> eachDuplicate (int []arr){
        HashSet<Integer> arrSorted = new HashSet<>();
        HashMap<Integer,Integer>arrMap = new HashMap<>();
        for (int el : arr) {
            if (arrMap.containsKey(el)) {
                arrMap.put(el, arrMap.get(el) +1);
            }
            else {
                arrMap.put(el, 1);
            }

        }
        return arrMap;
    }

    public static void main(String[] args) {
        int []niz = {1,2,2,2,3,4,5};
        System.out.println(DuplicateCount(niz));
        System.out.println(eachDuplicate(niz));

    }
}
