package DefaultIMethod;

public class RightAndLeftImpl implements Left,Right{
    @Override
    public void display() {

    }
    @Override
    public void print(){
        Left.super.print();
    }
}
