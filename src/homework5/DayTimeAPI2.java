package homework5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DayTimeAPI2 {
    public static void main(String[] args) {
        DayTimeAPI2 daytimeapi2 = new DayTimeAPI2();
        daytimeapi2.testLocalDateTime();
    }
    public void testLocalDateTime() {
        LocalDateTime currentTime = LocalDateTime.now();

        LocalDate meeting1 = LocalDate.from(currentTime.withMonth(5).withDayOfMonth(2).withYear(2022));
        LocalTime time1 = LocalTime.of(13, 0);
        System.out.println("Meeting 1) " + meeting1);
        System.out.println("Time of meeting 1) " + time1);

        LocalDate meeting2 = LocalDate.from(currentTime.withMonth(5).withDayOfMonth(9).withYear(2022));
        LocalTime time2 = LocalTime.of(13, 0);
        System.out.println("Meeting 2) " + meeting2);
        System.out.println("Time of meeting 2) " + time2);

        LocalDate meeting3 = LocalDate.from(currentTime.withMonth(5).withDayOfMonth(16).withYear(2022));
        LocalTime time3 = LocalTime.of(13, 0);
        System.out.println("Meeting 3) " + meeting3);
        System.out.println("Time of meeting 3) " + time3);

        LocalDate meeting4 = LocalDate.from(currentTime.withMonth(5).withDayOfMonth(23).withYear(2022));
        LocalTime time4 = LocalTime.of(13, 0);
        System.out.println("Meeting 4) " + meeting4);
        System.out.println("Time of meeting 4) " + time4);

        LocalDate meeting5 = LocalDate.from(currentTime.withMonth(5).withDayOfMonth(30).withYear(2022));
        LocalTime time5 = LocalTime.of(13, 0);
        System.out.println("Meeting 5) " + meeting5);
        System.out.println("Time of meeting 5) " + time5);

        LocalDate meeting6 = LocalDate.from(currentTime.withMonth(6).withDayOfMonth(6).withYear(2022));
        LocalTime time6 = LocalTime.of(13, 0);
        System.out.println("Meeting 6) " + meeting6);
        System.out.println("Time of meeting 6) " + time6);

        LocalDate meeting7 = LocalDate.from(currentTime.withMonth(6).withDayOfMonth(13).withYear(2022));
        LocalTime time7 = LocalTime.of(13, 0);
        System.out.println("Meeting 7) " + meeting7);
        System.out.println("Time of meeting 7) " + time7);

        LocalDate meeting8 = LocalDate.from(currentTime.withMonth(6).withDayOfMonth(20).withYear(2022));
        LocalTime time8 = LocalTime.of(13, 0);
        System.out.println("Meeting 8) " + meeting8);
        System.out.println("Time of meeting 8) " + time8);
    }
}

