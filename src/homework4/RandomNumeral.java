package homework4;

//2. Создать коллекцию, заполнить ее случайными целыми числами.
// Удалить повторяющиеся числа. Результат - коллекция без повторов.

import java.util.HashSet;

public class RandomNumeral {
    public static void main(String[] args) {

        System.out.println(createSet());
    }
    public static HashSet<Integer> createSet() {
        int a = 30;

        HashSet<Integer> integerHashSet = new HashSet<>();

        for (int i = 0; i < 30; i++){
            double random = Math.random() * a;
            integerHashSet.add((int) random);
        }
        return integerHashSet;
    }
}
