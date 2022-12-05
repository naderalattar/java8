package supplier;

import java.util.function.Supplier;

public class PasswordSupplier {
    public static void main(String[] args) {
        Supplier<String> password=()->{
            String pass="";
            String symbols="ABCDEFGHIJKLMNOPQRSTWXYZ*#@";
            Supplier<Integer> num=()->(int)(Math.random()*10);
            Supplier<Character> cha=()->symbols.charAt((int)(Math.random()*27));
            for (int i = 1; i <=8 ; i++) {
               if(i%2==0)
                   pass+=num.get();
               else
                   pass+=cha.get();
            }
            return pass;
        };

        System.out.println(password.get());
        System.out.println(password.get());
        System.out.println(password.get());
        System.out.println(password.get());


    }
}
