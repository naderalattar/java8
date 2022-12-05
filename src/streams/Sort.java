package streams;

import java.util.ArrayList;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        numbers.add(0);
        numbers.add(25);
        numbers.add(10);
        numbers.add(5);
        numbers.add(15);
        numbers.add(20);
        System.out.println(numbers);

        List<Integer> decentSorting=numbers.stream().sorted().toList();
        System.out.println(decentSorting);

        List<Integer> s=numbers.stream().sorted((n1,n2)-> n2.compareTo(n1)).toList();
        System.out.println(s);


        Integer i1=12;
        Integer i2=13;
        System.out.println(i1.compareTo(i2));
    }
}
