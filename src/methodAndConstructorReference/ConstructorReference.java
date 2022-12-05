package methodAndConstructorReference;

public class ConstructorReference {
    ConstructorReference(){
        System.out.println("inside constructor reference class");
    }
    public static void main(String[] args) {
        Interf interf=ConstructorReference::new;
        ConstructorReference constructorReference=interf.get();
    }
}
interface Interf{
    public ConstructorReference get();
}
