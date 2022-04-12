package homework4;

// 1. Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
// Удалить неудовлетворительные оценки из списка.
// == Так же на данном примере сделал 3-е задание не до конца разобрался с итераторами но
// == нашел высшую оценеку другим способом...
// 3. Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
// Найти самую высокую оценку с использованием итератора.

import java.util.ArrayList;
import java.util.Collections;

public class SchoolRating {
    public static void main(String[] args) {

        int element = 10;
        int negative = 4;
        ArrayList<Integer> mark = new ArrayList<Integer>();

        for (int i = 0; i < element; i++) {
            mark.add(i, (int)(Math.random() * 10 + 1));
        }
        System.out.println(mark);
        mark.removeIf(score -> score <= negative);
        System.out.println(mark);
        System.out.println(Collections.max(mark));
    }
}
