package dataAndTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class zone {
    public static void main(String[] args) {
        ZoneId zone=ZoneId.systemDefault();
        System.out.println(zone);

        ZoneId america=ZoneId.of("America/Anguilla");
        System.out.println(america);

        ZonedDateTime zonedDateTime=ZonedDateTime.now(america);
        System.out.println("time in america:"+zonedDateTime);

        LocalDateTime localDateTime=LocalDateTime.now(america);
        System.out.println("time in america:"+localDateTime);

    }
}
