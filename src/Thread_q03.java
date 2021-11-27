public class Thread_q03{
    public static void main(String[] args) {
        {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Number: " + i);
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 6; i <=10; i++) {
                System.out.println("Number: " + i);
            }
        }
    }
}
