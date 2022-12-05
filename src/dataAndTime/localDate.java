package dataAndTime;

import java.time.LocalDate;

public class localDate {
    public static void main(String[] args) {
        System.out.println("localDate api from java.time");
        LocalDate localDate=LocalDate.now();

        int day=localDate.getDayOfMonth();
        int month=localDate.getMonthValue();
        int year=localDate.getYear();
        System.out.println(localDate);
        System.out.printf("%d-%d-%d",day,month,year);
    }
}
