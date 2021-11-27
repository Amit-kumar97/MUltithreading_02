import java.util.Random;

public class Thread_q02 {

    public static void main(String[] args) {

        Random random = new Random();
        String colours[] = {"white", "blue", "black", "green", "red", "yellow"};
        int index;
        while ((index = random.nextInt(6)) != 4) {
            System.out.println(colours[index]);
        }
    }
}