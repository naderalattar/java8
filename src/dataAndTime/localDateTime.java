package dataAndTime;

import java.time.LocalDateTime;

public class localDateTime {
    public static void main(String[] args) {
        System.out.println("localDateTime api from java.time");

        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);
        int day2=localDateTime.getDayOfMonth();
        int month2=localDateTime.getMonthValue();
        int year2=localDateTime.getYear();
        System.out.printf("date:"+"%d-%d-%d",day2,month2,year2);
        int hour2=localDateTime.getHour();
        int minute2=localDateTime.getMinute();
        int second2=localDateTime.getSecond();
        int nano2=localDateTime.getNano();
        System.out.printf("\ntime:"+"%d:%d:%d:%d",hour2,minute2,second2,nano2);

        System.out.println("date in 2000 the year that i was born in");
        LocalDateTime yearOfBorn=LocalDateTime.of(2000,8,13,13,23,32);
        System.out.println("date:"+yearOfBorn);

        System.out.println("date after 14 month");
        System.out.println("date:"+localDateTime.plusMonths(15));
    }
}
