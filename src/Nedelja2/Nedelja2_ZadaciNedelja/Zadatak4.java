package Nedelja2.Nedelja2_ZadaciNedelja;
//4. Написати коментаре у Јави за Selection sort алгоритам користећи Јава код
//        приказан у задатку.
//        ● Ради лакшег разумевања може се користити видео материјал на
//        следећем линку: https://www.youtube.com/watch?v=xWBP4lzkoyM
        import java.util.Arrays;
class Main
{
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // Додати коментар шта ова функција ради - Funkcija ređa članove niza od najmanjeg do najvećeg
    public static void selectionSort(int[] arr)
    {
// Додати коментар за петљу - Petlja kreće od prvog člana niza do pretposlednjeg
        for (int i = 0; i < arr.length - 1; i++)
        {
// Додати коментар - //dodeljuje se promenjivoj "min" vrednost "i"
//                     (pretpostavlja se da je član sa "i" rednim brojem u nizu najmanji)
            int min = i;
            for (int j = i + 1; j < arr.length; j++)
            {
// Додати коментар - proverava da li je j-ti član niza manji od trenutno najmanjeg
                if (arr[j] < arr[min]) {
                    min = j; // Додати коментар - ukoliko jeste manji promenjiva "min" dobija vrednost "j"
                }
            }
// Додати коментар шта ова функција ради и шта представљају
//            ови параметри
            // parametar arr se dodeljuje argumentu arr u funkciji
            // min argumentu i
            // i argumentu j
            // zatim se funkcija swap izvršava nad "arr","min" i "i"

            swap(arr, min, i); // Funkcija menja mesta clanovima niza na pozicijama [min] i [i]
                               // u konkretnom slucaju najmanji broj postavlja na i-to mestu u svakom ciklusu prve petlje
        }
    }
    public static void main(String[] args)
    {
        int[] arr = { 3, 5, 8, 4, 1, 9, -2 };
        selectionSort(arr);
// Додати коментар шта се исписује  // Nakon primene funkcije selectionSort nad nizom "arr" brojevi su
                                    // poređani od najmanjeg do najvećeg, tako da se ispisuje
                                    // uređen string napravljen od niza "arr" koji je prethodno sortiran
                                    // po rastućem redosledu
        System.out.println(Arrays.toString(arr));
    }
}