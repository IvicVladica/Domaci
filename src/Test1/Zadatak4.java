package Test1;//4. (20п) Написати функцију која враћа да ли је макар један елемент низа дељив са прослеђеним бројем
//        Тежа верзија (+5п): Функција која враћа број елемената дељивих са прослеђеним бројем
//        int[] arr = { 10, 13, 14, 16, 25, 30, 32 };
//        anyDivisibleBy(arr, 3); // Враћа true (Јер је 30 дељиво са 3)
//        anyDivisibleBy(arr, 17); // Враћа false (Јер ни један елемент није дељив са 17)
//// Пример теже верзије
//        countDivisibleBy(arr, 3); // Враћа 1 (Јер је само 30 дељиво са 3)
//        countDivisibleBy(arr, 8); // Враћа 2 (Јер су 16 и 32 дељиви са 8)
//        countDivisibleBy(arr, 2); // Враћа 5 (Јер су 10, 14, 16, 30 и 32 дељиви са 2)
//        countDivisibleBy(arr, 17); // Враћа 0 (Јер ни један елемент није дељив са 17)

public class Zadatak4 {
    public static boolean anyDivisibleBy(int [] arr, int x) {
        boolean check = false;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] % x == 0) {
                check = true;
            }
        }
        return check;
    }
    public static int countDivisibleBy(int [] arr, int x){
        int count = 0;
        for (int j=0; j<arr.length; j++) {
            if (arr[j] % x == 0) {
                count = count + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int niz[] = {10,13,14,16,25,30,32};
        int a = 17;
        System.out.println(anyDivisibleBy(niz,a));
        System.out.println(countDivisibleBy(niz,a));
    }
}
