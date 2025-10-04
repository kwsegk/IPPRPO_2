public class MaxNumberFinder {
    public static void main(String[] args) {
        System.out.println("Программа для поиска максимума из трёх чисел");
    }
    public static int findMax(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        if (b >= a && b >= c) return b;
        return c;
    }
}