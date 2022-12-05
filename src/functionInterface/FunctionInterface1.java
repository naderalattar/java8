package functionInterface;

import java.util.function.Function;

public class FunctionInterface1 {
    public static void main(String[] args) {
        Function<String,Integer> function= s -> s.length();
        System.out.println(function.apply("nader"));
    }
}
