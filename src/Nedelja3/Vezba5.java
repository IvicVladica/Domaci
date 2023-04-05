package Nedelja3;
//unesite neki string "Hello"
//da na steku imam "olleH"

import java.util.Stack;

public class Vezba5 {
    public static void main(String[] args) {
        String input = "Hello";
        String result = "";
        Stack<Character>inputStack = new Stack<>();
        for (int i=0; i<input.length(); i++){
            inputStack.push(input.charAt(i));
        }
        for (int i=0; i<input.length(); i++){
            result = result + inputStack.pop();
        }
        System.out.println(result);
    }
}
