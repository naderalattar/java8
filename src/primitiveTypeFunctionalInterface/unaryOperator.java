package primitiveTypeFunctionalInterface;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class unaryOperator {
    public static void main(String[] args) {
        UnaryOperator<Integer> pow=i->i*i;
        System.out.println(pow.apply(5));

        IntUnaryOperator pow2= i->i*i;
        System.out.println(pow.apply(5));
        
    }
}
