import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class NumberGenerator {
    private static final int ball = 0;
    private static final int strike = 0;
    private static int figure = 0;

    public NumberGenerator() {
        figure = (int)(Math.random() * 9.0) + 1;
    }

    public NumberGenerator(int figure) {
        NumberGenerator.figure = figure;
    }

    public int getFigure() {
        return figure;
    }

    public int getBall() {
        return 0;
    }

    public int getStrike() {
        return 0;
    }

    public static Set<Integer> makeRandomNumbers() {
        Set<Integer> number = new HashSet();
        Random random = new Random();

        while(number.size() < 3) {
            figure = random.nextInt(9) + 1;
            number.add(figure);
        }

        return number;
    }
}
