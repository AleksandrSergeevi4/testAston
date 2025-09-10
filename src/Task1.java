import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        while (true) {
            System.out.print("Введите значение a: ");
            String input = scanner.nextLine();

            try {
                a = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите число!");
            }
        }

        while (true) {
            System.out.print("Введите значение b: ");
            String input = scanner.nextLine();

            try {
                b = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите число!");
            }
        }

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else if (a == b) {
            System.out.println("a = b");
        }
        //Операции с числами
        System.out.println("Операции с этими значениями:");
        System.out.println("Сложение:" + (a + b));
        System.out.println("Вычитание:" + (a - b));

        //Деление на ноль
        if (b != 0){
            System.out.println("Деление:" + (a / b));
        } else {
            System.out.println("Деление:" + "На ноль делить нельзя!");
        }

        System.out.println("Умножение:" + (a * b));
    }
}