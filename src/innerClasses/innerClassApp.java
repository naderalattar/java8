package innerClasses;

public class innerClassApp {
    public static void main(String[] args) {
        Product.Builder builder=new Product.Builder();
        builder.display();
        Product product=new Product();
        product.display();

        Product product1=new Product(){

            @Override
            public void display(){
                System.out.println("inside annonymous class");
            }
        };
        product1.display();
    }
}
