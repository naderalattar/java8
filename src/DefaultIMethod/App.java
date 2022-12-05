package DefaultIMethod;

public class App {
    public static void main(String[] args) {
        Left left=new RightAndLeftImpl();
        Right right=new RightAndLeftImpl();
        left.print();
        right.print();
        
    }
}
