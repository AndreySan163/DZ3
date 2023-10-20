import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int one = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите второе целое число: ");
        int two = scanner.nextInt();
        scanner.nextLine();
        int rez = one + two;
        int rez1 = one - two;
        int rez2 = one * two;
        int rez3 = one / two;
        System.out.printf("Сложение: %d \nВычетание: %d \nУмножение: %d \nДеление: %d  ", rez, rez1, rez2, rez3);
    }
}