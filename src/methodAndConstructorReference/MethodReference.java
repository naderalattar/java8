package methodAndConstructorReference;

public class MethodReference {
    public static void display(){
        System.out.println("method reference static method");
    }
    public void display2(){
        System.out.println("method reference instance method");

    }
    public static void main(String[] args) {

        Printer printer=MethodReference::display;
        Printer printer2=new MethodReference()::display2;

        printer.print();
        printer2.print();
    }

}
interface Printer{
    public void print();
}
