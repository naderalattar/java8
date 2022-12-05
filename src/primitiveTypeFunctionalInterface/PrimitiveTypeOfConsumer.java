package primitiveTypeFunctionalInterface;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.ObjDoubleConsumer;

public class PrimitiveTypeOfConsumer {
    public static void main(String[] args) {
        IntConsumer displayer1=i-> System.out.println(i);
        displayer1.accept(33);

        DoubleConsumer displayer2=d-> System.out.println(d);
        displayer2.accept(44);

        LongConsumer displayer3=l-> System.out.println(l);
        displayer3.accept(55);

        ObjDoubleConsumer<product> increse=(p,d)-> System.out.println(p.getPrice()+d);
        increse.accept(new product("phone",5000),40);

        
    }
}
