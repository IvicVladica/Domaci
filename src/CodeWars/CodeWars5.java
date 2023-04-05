package CodeWars;//Write a function cubeSum(n, m) that will calculate a sum of cubes of numbers in a given range, starting from the smaller (but not including it) to the larger (including). The first argument is not necessarily the larger number.
//
//        If both numbers are the same, then the range is empty and the result should be 0.
//
//        Examples:
//
//        cubeSum(2,3); // => 3^3 = 27
//        cubeSum(3,2); // => 3^3 = 27
//        cubeSum(0,4); // => 1^3+2^3+3^3+4^3 = 100
//        cubeSum(17, 14); // => 15^3+16^3+17^3 = 12384
//        cubeSum(9, 9); // => 0


public class CodeWars5 {
    public static int cubeSum(int x, int y) {
        int sum = 0;
        if (x>y) {
            for (int j=y+1; j<=x; j++){
                sum = (int) (sum + (Math.pow(j,3)));
            }
        }
        for (int i=x+1; i<=y; i++) {
            sum = (int) (sum + (Math.pow(i,3)));

        }
        return sum;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int result = cubeSum(a,b);
        System.out.println(result);
    }
}
