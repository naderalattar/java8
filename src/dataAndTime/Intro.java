package dataAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Intro {
    public static void main(String[] args) {

        System.out.println("date api from java.util");
        Date date=new Date();
        System.out.println(date);
        System.out.println(date.getDay());

        System.out.println("/nlocalDate api from java.time");
        LocalDate localDate=LocalDate.now();

        int day=localDate.getDayOfMonth();
        int month=localDate.getMonthValue();
        int year=localDate.getYear();
        System.out.println(localDate);
        System.out.printf("%d-%d-%d",day,month,year);

        System.out.println("\nlocalTime api from java.time");
        LocalTime localTime=LocalTime.now();

        int hour=localTime.getHour();
        int minute=localTime.getMinute();
        int second=localTime.getSecond();
        int nano=localTime.getNano();

        System.out.println(localTime);
        System.out.printf("%d:%d:%d:%d",hour,minute,second,nano);


        System.out.println("\nlocalDateTime api from java.time");

        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);
        int day2=localDateTime.getDayOfMonth();
        int month2=localDateTime.getMonthValue();
        int year2=localDateTime.getYear();
        System.out.printf("date :"+"%d-%d-%d",day2,month2,year2);
        int hour2=localDateTime.getHour();
        int minute2=localDateTime.getMinute();
        int second2=localDateTime.getSecond();
        int nano2=localDateTime.getNano();
        System.out.printf("%d:%d:%d:%d",hour2,minute2,second2,nano2);

    }
}
