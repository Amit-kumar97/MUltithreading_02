public class Thread_q05 extends Thread{
    public void run()
    {
        System.out.println("t1 Thread priority: "+Thread.currentThread().getPriority());
    }
}
class t2 extends Thread
{
    public void run()
    {
        System.out.println("T2 Thread priority: "+Thread.currentThread().getPriority());
    }
}
class test67
{
    public static void main(String[] args) {
        Thread_q05 t1 = new Thread_q05();
        t2 t2 =  new t2();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
        System.out.println("Main Thread priority: "+Thread.currentThread().getPriority());
        t1.start();
        t2.start();
    }
}