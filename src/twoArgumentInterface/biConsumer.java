package twoArgumentInterface;

import java.util.function.BiConsumer;

public class biConsumer {
    public static void main(String[] args) {
        BiConsumer<String,String> printer=(s1,s2)-> System.out.println(s1+" : "+s2);
        printer.accept("nader","mohamed");
    }
}
