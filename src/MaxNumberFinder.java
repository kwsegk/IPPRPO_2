import java.util.Scanner;

public class MaxNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("Проверка равенства");
        int max = findMax(a, b, c);
        if (a == b && b == c) {
            System.out.println("Все числа равны: " + a);
        } else {
            System.out.println("Максимум: " + max);
        }
        System.out.println("Изменяю код, но не коммичу");
    }
    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c)); // Более надёжный способ
    }
}

//Немного другой коментаааарий