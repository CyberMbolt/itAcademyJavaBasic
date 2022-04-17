package homework5;

//2. Написать собственное исключение от Exception.
// Сгенерировать код, который будет выбрасывать его и обрабатывать.
// Результат работы программы вывести на экран.

import java.util.Scanner;

// Нужно в консоли ввести любое число больше нуля
public class Exception1 {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = Integer.parseInt(scanner.nextLine());

            if (a != 0) {
                throw new ScannerException("Введено что-то кроме нуля");
            }
        }
    }
}
