package Nedelja3_ZadaciNedelja;//* 2. Uparenost zagrada
//        * Napisi program koji proverava da li su zagrade dobro uparene.
//        *
//        * ()()() -> jesu
//        * (((([{}()])))) -> jesu
//        * ((( -> nisu
//        * ) -> nisu
//        * ()(() -> nisu
//        * */
//
///*
// * stack = []
// * (([{}]))
// * */

import java.util.Stack;

public class Zadatak3 {
    public static boolean BracketCheck (String input){
        Stack<Character>inputStack = new Stack<>();
        for (int i=0; i<input.length();i++) {
            if (input.charAt(i) == '(' || input.charAt(i) == '[' || input.charAt(i) == '{') {
                inputStack.push(input.charAt(i));
            }
            if (inputStack.isEmpty()) return false;
            char BracketStock;
            char nextBracket = input.charAt(i);
            switch (nextBracket) {
                case ')':
                    BracketStock = inputStack.pop();
                    if (BracketStock == '[' || BracketStock == '{') return false;
                    break;
                case ']':
                    BracketStock = inputStack.pop();
                    if (BracketStock == '(' || BracketStock == '{') return false;
                    break;
                case '}':
                    BracketStock = inputStack.pop();
                    if (BracketStock == '(' || BracketStock == '[') return false;
                    break;
            }
        }
        return (inputStack.isEmpty());
    }

    public static void main(String[] args) {
        String x = ("(((([{}()]))))");
        System.out.println(BracketCheck(x));
    }

}
