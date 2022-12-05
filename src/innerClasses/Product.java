package innerClasses;

public class Product {

    public void display(){
        System.out.println("inside Product class object");
    }
    static class Builder{

        public void display(){
            System.out.println("inside builder   class object");
        }
    }

}
