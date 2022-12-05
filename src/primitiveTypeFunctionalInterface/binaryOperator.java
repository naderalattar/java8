package primitiveTypeFunctionalInterface;

import java.util.function.BinaryOperator;

public class binaryOperator {
    public static void main(String[] args) {
        BinaryOperator<String> concat=(s1,s2)->s1+s2;
        
        System.out.println(concat.apply("nader : ","alattar"));


    }
}
