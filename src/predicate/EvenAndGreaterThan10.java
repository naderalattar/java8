package predicate;

import java.util.function.Predicate;

public class EvenAndGreaterThan10 {
    public static void main(String[] args) {

        Predicate<Integer> p1=i->i>10;
        Predicate<Integer> p2=i->i%2==0;
        int [] nums={0,5,10,15,20,25,30};
        System.out.println("the numbers that greater than 10");
        apply(p1,nums);
        System.out.println("the even numbers");
        apply(p2,nums);
        System.out.println("the numbers that not greater than 10");
        apply(p1.negate(),nums);
        System.out.println("the odd numbers");
        apply(p2.negate(),nums);
        System.out.println("the even numbers that  greater than 10 ");
        apply(p1.and(p2),nums);
        System.out.println("the even numbers or greater than 10");
        apply(p2.negate(),nums);

    }

    public static void apply(Predicate<Integer> predicate,int [] nums){
        for (int i : nums){
            if(predicate.test(i))
                System.out.println(i);
        }
    }
}
