package anonymousInnerClass;

public class Closure {
    public static void main(String[] args) {

        Test t=new Test();
        t.display();
        t.print();
    }
}
interface inter{
    public void display();
}
class Test{
    int instaceVariable=20;
    public void display(){
        int localVariable=30;
        inter inter=()->{
            System.out.println(localVariable);
            System.out.println(instaceVariable);
            instaceVariable=543;
        };
        inter.display();

    }
    public void print(){
        System.out.println(instaceVariable);
    }
}
