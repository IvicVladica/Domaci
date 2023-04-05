package Nedelja3;

import java.util.ArrayList;
import java.util.Arrays;

//Написати програм који избацује парне елементе из ArrayList-е

public class Vezba2 {

    public static ArrayList<Integer> oddNum(ArrayList<Integer>arr) {
        ArrayList<Integer>res = new ArrayList<Integer>();
        for (var el : arr){
            if (el % 2 != 0)
                res.add(el);
        }
        return res;
    }
//    Написати програм који филтрира листу тако да добијемо:
//            - Листу свих позитивних бројева
//    - Листу свих негативних бројева

    public static void numSort(ArrayList<Integer>arr) {
        ArrayList<Integer>pos = new ArrayList<Integer>();
        ArrayList<Integer>neg = new ArrayList<Integer>();
        for (var el : arr) {
            if (el > 0) {
                pos.add(el);
            }
            else  {
                neg.add(el);
            }
        }
        System.out.println("Pozitivni: " + pos);
        System.out.println("Negativni: " + neg);

    }
//    Написати програм који избацује све елементе листе који имају мање од 4 карактера
//    - String

    public static ArrayList<String> sortStr(ArrayList<String>input) {
        ArrayList<String>result = new ArrayList<String>();
        for (var el : input) {
            if (el.length()>=4) {
                result.add(el);
            }
        }
        return result;
    }

//    Написати функцију која проширује String нулама до N карактера
//
//    ```java
//    padRight("dpj", 5); // Враћа "dpj00"
//    padRight("dpj", 2); // Враћа "dpj"
//    padRight("dpj", 3); // Враћа "dpj"
//    padRight("dpj11", 6); // Враћа "dpj110"
//
//    padLeft("dpj", 5); // Враћа "00dpj"
//    padLeft("dpj", 2); // Враћа "dpj"
//    padLeft("dpj", 3); // Враћа "dpj"
//    padLeft("dpj11", 6); // Враћа "0dpj11"

    public static String padRight (String input ,int x) {
        int start = x-input.length();
        String result = (input);
        for (int i=0; i<start; i++) {
            result = result + "0";
        }
        return result;
    }

    public static String padLeft (String input ,int x) {
        int start = x-input.length();
        String result = (input);
        for (int i=0; i<start; i++) {
            result = "0" + result;
        }
        return result;
    }

//    Написати програм који све елементе низа који имају мање од 4 карактера проширује нулама

    public static String [] upTo4 (String [] input){
        String [] result = new String[input.length];
        for (int i=0; i<input.length; i++) {
            result[i] = padLeft(input[i], 4);
        }
        return result;
    }

    public static void main(String[] args) {
        var arrList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,5,6,7,-5,-2,-1, 11));
        var stList = new ArrayList<String>(Arrays.asList("proba","dva", "tri","jedan","cetr"));
        System.out.println("Neparni su: " + oddNum(arrList));
        numSort(arrList);
        System.out.println(sortStr(stList));
        String a = ("dpj11");
        int x = 2;
        System.out.println(padRight(a,x));
        System.out.println(padLeft(a,x));
        String [] niz1 = {"abc","abcd", "xyz", "123456", "12"};
        System.out.println(Arrays.toString(upTo4(niz1)));

    }
}
