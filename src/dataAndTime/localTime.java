package dataAndTime;

import java.time.LocalTime;

public class localTime {
    public static void main(String[] args) {
        System.out.println("localTime api from java.time");
        LocalTime localTime=LocalTime.now();

        int hour=localTime.getHour();
        int minute=localTime.getMinute();
        int second=localTime.getSecond();
        int nano=localTime.getNano();

        System.out.println(localTime);
        System.out.printf("%d:%d:%d:%d",hour,minute,second,nano);
    }
}
