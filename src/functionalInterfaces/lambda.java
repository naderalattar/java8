package functionalInterfaces;

public class lambda {
    public static void main(String[] args) {

        Display display= () -> System.out.println("display1");
        display.display1();

        Sum sum= (a,b) -> System.out.println("the sum is : "+(3+5));
        sum.sum(5,6);

        Length  length=s->s.length();
        System.out.println(length.getLength("nader"));

        Thread thread=new Thread(()-> {
            for (int i = 0; i <20; i++) {
                System.out.println("inside the new thread "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        thread.start();

        for (int i = 0; i <20; i++) {
            System.out.println("inside main thread "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }






    }

}
