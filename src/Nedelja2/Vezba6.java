package Nedelja2;// 4. Написати функцију која проверава да ли је мејл валидан (претпоставити да имамо
// једно или 0 @ и једна .)
//     - Мора имати знак `@`
//     - Мора имати знак `.`
//     - Пре знака @ мора постојати макар 1 карактер који је слово
//          - isLetter(char c)
//     - После знака . мора постојати макар 1 карактер који је слово
//     - Између @ и . мора постојати макар 1 карактер који је слово

import java.util.Scanner;

public class Vezba6 {

    public static boolean mailValidation(String input){
        if (input.contains("@") && input.contains(".")) {
            int posAt = input.indexOf('@');
            int posPoint = input.indexOf('.');
            boolean checkStart = false;
            boolean checkMiddle = false;
            boolean checkEnd = false;
            for (int i = 0; i <= posAt; i++) {
                if (Character.isLetter(input.charAt(i))) {
                    checkStart = true;
                    break;}
            }
            for (int j = posAt; j <= posPoint; j++) {
                if (Character.isLetter(input.charAt(j))) {
                    checkMiddle = true;
                    break;}
            }
            for (int k = posPoint; k < input.length(); k++) {
                if (Character.isLetter(input.charAt(k))) {
                    checkEnd = true;
                    break;}
            }
            if (checkStart && checkMiddle && checkEnd) return true;
        }
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Upisite mail: ");
        String mail = sc.next();

        System.out.println(mailValidation(mail));
    }
}
