public class Mythread01 implements Runnable
{
    String message;

    Mythread01(String msg) {
        message = msg;
    }
    public void run() {
        for (int count = 0; count <= 5; count++) {
            try {
                System.out.println("Run method: " + message);
                Thread.sleep(100);
            } catch (InterruptedException ie) {
                System.out.println("Exception in thread: " + ie.getMessage());
            }
        }
    }
}
class test34
{
    public static void main(String[] args)
    {
        Mythread01 obj1 = new Mythread01("MyThread obj1");
        Mythread01 obj2 = new Mythread01("MyThread obj2");
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}