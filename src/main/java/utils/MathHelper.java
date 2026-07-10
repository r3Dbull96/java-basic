package utils;

public class MathHelper {
    static int sum(int a, int b) {
        return  a + b;
    }

    static int max(int a, int b) {
        return  a > b ? a : b;
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }


    public static void main(String[] args) {
        System.out.println(MathHelper.sum(1,2));
        System.out.println(MathHelper.max(2,4));
        System.out.println(MathHelper.isEven(5));
    }
}
