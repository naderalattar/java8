package methodAndConstructorReference;

public class ThreadUsingMethodReference {
    public void iterate()  {
        for (int i=0;i<10;i++){
            System.out.println("inside child thred");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args)  {


        Thread thread=new Thread(new ThreadUsingMethodReference()::iterate);
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i=0;i<10;i++){
            System.out.println("inside main thread");
        }


    }
}
