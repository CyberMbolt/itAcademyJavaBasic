package homework5;

import java.time.LocalDate;

 // 3.От текущей даты вывести на экран дату, которая была 60 дней назад.

public class DayTimeAPI {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        ld = ld.minusDays(60);
        System.out.println(ld);
    }
}
