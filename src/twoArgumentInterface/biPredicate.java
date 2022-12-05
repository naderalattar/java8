package twoArgumentInterface;

import java.util.function.BiPredicate;

public class biPredicate {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> sumCheck=(i1,i2)->i1+i2==10;
        System.out.println(sumCheck.test(2,8));
        System.out.println(sumCheck.test(3,6));

    }
}
