package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArray {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        numbers.add(0);
        numbers.add(25);
        numbers.add(10);
        numbers.add(5);
        numbers.add(15);
        numbers.add(20);

        Integer[] array=numbers.stream().toArray(size -> new Integer[size]);
        Integer[] array2=numbers.stream().toArray(Integer[]::new);

        Arrays.stream(array).forEach(System.out::println);



    }
}
