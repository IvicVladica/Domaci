package Nedelja3.Nedelja3_ZadaciSreda;//2. //Napisite Java funkciju koja uzima dva niza i vraca True ako
//        imaju bar jednog zajednickog clana

public class Zadatak2 {
    public static boolean contains (String arr[],String x){
        for (int i=0; i<arr.length; i++) {
            if (arr[i].equals(x)){
                return true;
        }
        }
        return false;
    }

    public static boolean checkArrays (String arr1[], String arr2[]) {
        for (int i=0; i<arr1.length; i++){
            if (contains(arr2, arr1[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String a [] = {"1","2","3","4","5"};
        String b [] = {"1","8","8","8","8","8"};
        System.out.println(checkArrays(a,b));
    }
}
