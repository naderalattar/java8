package anonymousInnerClass;

public class Rectangle {
    int x;
    int y;
    Rectangle(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void displayArea1(){
        Area area=()->{
            System.out.println("area is : "+(x*y));
        };
        area.calArea();
    }

    public void displayArea2(){
        Area area=new Area() {
            int x=55;
            @Override
            public void calArea() {
                System.out.println("area is : "+(this.x*y));
                System.out.println("area is : "+(Rectangle.this.x*y));
            }
        };
        area.calArea();
    }
}
