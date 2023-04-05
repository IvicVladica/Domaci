package Nedelja2;//1. Написати функцију која од имена и презимена (два прослеђена стринга) враћа иницијале
//
//        ```
//        initials("Pera","Simic"); -> PS
//        initials("Zika", "Peric"); -> ZP
//        ```


import java.util.Scanner;

public class Vezba3 {
    public static String initials(String ime, String prezime) {
        char i1 = (ime.charAt(0));
        char p1 = (prezime.charAt(0));
        return "" + i1 + p1;
    }

//    2. Написати функцију која проверава да ли стринг садржи најмање x прослеђених слова
//
//```
//    atLeast2("PericaPeric", 'a', 2)
//```

    public static boolean atLeast2(String text, char slovo, int x) {
        int brojac = 0;
        for (int i = 0; i < text.length(); i++) {
            char sledeceSlovo = text.charAt(i);
            if (sledeceSlovo == slovo) {
                brojac = brojac + 1;
            }
            if (brojac >= x) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ime = sc.next();
        char slovo = sc.next().charAt(0);
        int broj = sc.nextInt();


        System.out.println(atLeast2(ime, slovo, broj));

    }

}

