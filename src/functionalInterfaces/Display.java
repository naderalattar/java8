package functionalInterfaces;

@java.lang.FunctionalInterface
public interface Display {
    final String name="";
    public void display1();

    default void display2(){
        System.out.println("display2");
    }

    public  static void display3(){

        System.out.println("display3");
    }

}
