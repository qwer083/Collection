import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> ballsLucky = new ArrayList<>(100);
        for (int i = 1; i <= 100; i++) {
            ballsLucky.add(random.nextInt(10000));
        }

        Collections.shuffle(ballsLucky);
        for (int i = 0; i < 10; i++) {
            System.out.println(ballsLucky.get(i));
        }

    }
}
