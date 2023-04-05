package Nedelja2.Nedelja2_ZadaciNedelja;//2. Написати програм који налази други највећи број у низу.
//        ● Низ бројева је 2,4,1,7,3,6;
//        ● Програм налази други највећи број и исписује га на екран.
//        Пример улаза и излаза.
//        Улаз:
//        низ 2,4,1,7,3,6
//        Излаз:
//        “Други највећи број је 6!”

public class Zadatak2 {

    public static int Maximum2(int niz[]){
        int Max1 = niz[0];
        for (int i=1; i<niz.length; i++) {
            if (niz[i] > Max1) {
                Max1 = niz[i];
            }
        }
            int Max2 = niz[0];
            for (int j=1; j<niz.length; j++){
                if (niz[j]<Max1 && niz[j]>Max2) {
                    Max2 = niz[j];
                }
            }
            return Max2;
        }

    public static void main(String[] args) {
        int [] Niz1 = {1,2,5,5,6,240,509};
        System.out.println("Drugi najveci broj je " + Maximum2(Niz1) + "!");
    }
    }

