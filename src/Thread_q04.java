public class Thread_q04 extends Thread
{
    @Override
    public void run() {                                          //check  it
        for (int i = 1; i <20; i++) {
            if (i % 2 == 0)
            {
                System.out.println("Even Number: "+i);
            }
        }
        try {
            Thread_q04.sleep(500);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
class test45
{
    public static void main(String[] args) throws InterruptedException {
        Thread_q04 t1 = new Thread_q04();
        t1.start();
        for (int i = 1; i <20; i++) {
            if(i % 2 != 0)
            {
                System.out.println("Odd Number: "+i);
            }
        }
        t1.join();
    }
}