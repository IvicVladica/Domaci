package Nedelja3.Nedelja3_ZadaciNedelja;///*
// * 2. Uparenost zagrada
// * Napisi program koji proverava da li su zagrade dobro uparene.
// *
// * ()()() -> jesu
// * (((([{}()])))) -> jesu
// * ((( -> nisu
// * ) -> nisu
// * ()(() -> nisu
// * */
//
///*
// * stack = []
// * (([{}]))
// * */

public class Zadatak3b {
    public static boolean isValid(String input){
        boolean checkOrder = true;
        boolean checkSum = true;
        boolean check;
        char first = ' ';
        char second = ' ';
        int countMalaL = 0;
        int countMalaD = 0;
        int countSrednjaL = 0;
        int countSrednjaD = 0;
        int countVelikaL = 0;
        int countVelikaD = 0;

        for (int i=0; i<input.length(); i++) {
            char next = input.charAt(i);
            switch (next) {
                case '(': countMalaL = countMalaL + 1; break;
                case ')': countMalaD = countMalaD + 1; break;
                case '[': countSrednjaL = countSrednjaL + 1; break;
                case ']': countSrednjaD = countSrednjaD + 1; break;
                case '{': countVelikaL = countVelikaL + 1; break;
                case '}': countVelikaD = countVelikaD + 1; break;
            }


        }
        for (int j =0; j<input.length()-1; j++){
            first = input.charAt(j);
            second = input.charAt(j+1);
            if ((first == '(' && second != '(' && second != ')' && second != '{' && second != '[') ||
                (first == '[' && second != '[' && second != '(' && second != '{' && second != ']') ||
            (first == '{' && second != '{' && second != '(' && second != '}' && second != '[')) {checkOrder=false;}
        }
        if ((countMalaL != countMalaD) || (countSrednjaL != countSrednjaD) || (countVelikaL != countVelikaD)) {checkSum=false;}
        System.out.println(checkOrder);
        System.out.println(checkSum);
        check = checkOrder && checkSum;
        return check;
    }

    public static void main(String[] args) {
        String x = ("()(()");
        System.out.println(isValid(x));
    }
}
