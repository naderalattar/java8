package functionalInterfaces;

public abstract class AbstractClass {

    int id;
    String name;
    public AbstractClass(){

    }
    public AbstractClass(int id,String name){
        this.id=id;
        this.name=name;
    }
    public void prin1(){
        System.out.println("print 1");
    }

    public abstract void print2();
    public static void  print3(){
        System.out.println("print 3");

    }
}
