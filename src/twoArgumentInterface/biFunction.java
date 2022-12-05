package twoArgumentInterface;

import java.util.function.BiFunction;

public class biFunction {
    public static void main(String[] args) {
        BiFunction<String,String,String> concat=(s1,s2)->"full name is :"+s1+" "+s2;
        System.out.println(concat.apply("nader","alattar"));
    }
}
