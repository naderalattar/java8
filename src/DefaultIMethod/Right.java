package DefaultIMethod;

public interface Right {
    public void display();
    public default void print(){
        System.out.println("inside left interface");
    }

}
