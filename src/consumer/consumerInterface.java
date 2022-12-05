package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class consumerInterface {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("nader");
        names.add("mohamed");
        names.add("ahmed");
        names.add("elsayed");
        Consumer<List<String>> namePrinter=l->{
            for (String s:l){
                System.out.println(s);
            }
        };

        namePrinter.accept(names);
    }
}
