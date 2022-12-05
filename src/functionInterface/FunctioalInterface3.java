package functionInterface;

import java.util.function.Function;

public class FunctioalInterface3 {
    public static void main(String[] args) {
        String name="nader alattar";
        Function<String,String> uperCase=s -> s.toUpperCase();
        Function<String,String> first5=s->s.substring(0,5);
        System.out.println(uperCase.andThen(first5).apply(name));

    }
}
