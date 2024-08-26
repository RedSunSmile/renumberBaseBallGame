import java.util.List;
import java.util.Set;

public class BothBallCompare {
    private static final int mybaseball = 0;
    private static int balls = 0;
    private static int strikes = 0;
    static Set<Integer> partnerball = NumberGenerator.makeRandomNumbers();
    static Set<Integer> userball = MakePlayerBall.makePlayerball();

    public BothBallCompare() {
    }

    public void CountMatch(List<Integer> playerball, List<Integer> computer) {
        int balls = 0;
        int strikes = 0;

        for(int i = 0; i < playerball.size(); ++i) {
            if (((Integer)computer.get(i)).equals(playerball.get(i))) {
                ++strikes;
            } else if (computer.contains(playerball.get(i))) {
                ++balls;
            }
        }

        if (balls == 0 && strikes == 0) {
            System.out.println("낫싱");
        }

        System.out.println("" + balls + "볼 " + strikes + "스트라이크");
        if (strikes != 3) {
            PlaysBallGame.UserInput();
        }

        if (strikes == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다. 게임종료");
            PlaysBallGame.reStart();
        }

    }
}
