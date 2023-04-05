package Nedelja2;

public class FizzBuzzZazz {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            String res = "";
            if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                System.out.print(i);
            }
            else if (i % 3 == 0) {
                res += "Fizz";
            }
            else if (i % 5 == 0) {
                res += "Buzz";
            }
            else if (i % 7 == 0) {
                res += "Zazz";
            }


            System.out.println(res);
        }
    }
}
