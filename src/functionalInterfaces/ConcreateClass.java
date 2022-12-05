package functionalInterfaces;

public class ConcreateClass extends AbstractClass{

    public ConcreateClass(int id,String name){
        super(id, name);
    }
    @Override
    public void print2() {
        System.out.println("print 2");

    }
}
