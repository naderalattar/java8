package primitiveTypeFunctionalInterface;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class PremitiveTypeOfFunction {
    public static void main(String[] args) {
        IntFunction<Integer> pow= i->i*i;
        System.out.println(pow.apply(5));

        ToIntFunction<String> getLenght=s->s.length();
        System.out.println(getLenght.applyAsInt("nader"));

        IntToDoubleFunction sqrt=i->Math.sqrt(i);
        System.out.println(sqrt.applyAsDouble(4));




    }
}
