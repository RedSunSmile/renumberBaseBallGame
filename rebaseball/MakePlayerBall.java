import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MakePlayerBall {
    private static int mybaseball = 0;

    public MakePlayerBall() {
    }

    public static Set<Integer> makePlayerball() {
        Set<Integer> userball = new HashSet();
        Random random = new Random();

        while(userball.size() < 3) {
            mybaseball = random.nextInt(9) + 1;
            userball.add(mybaseball);
        }

        return userball;
    }
}
