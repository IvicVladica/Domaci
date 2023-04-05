package CodeWars;//Simple, given a string of words, return the length of the shortest word(s).
//
//        String will never be empty and you do not need to account for different data types.

public class CodeWars9 {
    public static void main(String[] args) {
        String input = ("Da probamo i koja rec je najkraca");
        String [] out = input.split(" ");
        int small = out[0].length();
        for (int i=0; i< out.length; i++){
            int l = out[i].length();
            if (l < small) {
                small =l;
            }
        }
        System.out.println(small);
    }

}
