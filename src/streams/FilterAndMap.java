package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMap {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        numbers.add(20);
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(25);
        numbers.add(30);

        System.out.println(numbers);
        List<Integer> oddnumbers=numbers.stream().filter(n->n%2!=0).collect(Collectors.toList());

        System.out.println(oddnumbers);

        List<Integer> doubledOddNumbers = oddnumbers.stream().map(n -> {
            return n * 2;
        }).toList();

        System.out.println(doubledOddNumbers);



       List<String> stringVlaue= numbers.stream().map((i)->String.valueOf(i)+"s" ).toList();
        System.out.println(stringVlaue);


    }
}

class Student{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
