package DefaultIMethod;

public interface Left {
    public void display();
    public default void print(){
        System.out.println("inside left interface");
    }
}
