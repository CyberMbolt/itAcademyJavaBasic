package homework5;

// 1. Написать код, который выбрасывает NullPointerException.
// Написать обработчик этого исключения и вывести на экран сообщение,
// которое будет содержать описание данного исключения.

public class NPECatch {
    public static void main(String[] args) {
       try {
           String name = null;
           name.length();
       } catch (NullPointerException q) {
           System.out.println("Попытка вызвать метод String на null");
       }
    }
}
