package dataAndTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class period {
    public static void main(String[] args) {
        LocalDate birthDate=LocalDate.of(2000, Month.AUGUST,13);
        LocalDate today=LocalDate.now();

        Period myAge=Period.between(birthDate,today);

        System.out.printf("my age:%d-%d-%d",myAge.getYears(),myAge.getMonths(),myAge.getDays());
    }
}
