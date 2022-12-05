package functionInterface;

import java.util.function.Function;

public class AndThen_Compose {
    public static void main(String[] args) {
        Function<String ,Integer> len=s-> s.length();
        Function<Integer,String>  toInt=i->String.valueOf(i)+"n";

        System.out.println(len.andThen(toInt).apply("nader"));
    }
}
