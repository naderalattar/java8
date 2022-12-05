package supplier;

import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {
        Supplier<String> nameSupplier=()->{
            String[] names={"nader","mohamed","ahmed"};
            int ramdomNum= (int) (Math.random()*3);
            return names[ramdomNum];
        };

        System.out.println(nameSupplier.get());
        System.out.println(nameSupplier.get());
        System.out.println(nameSupplier.get());
    }
}
