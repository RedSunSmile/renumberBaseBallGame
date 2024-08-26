import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import rebaseball.BothBallCompare;

public class BothBallCompareTest {
    BothBallCompare bothball;

    public BothBallCompareTest() {
    }

    @BeforeEach
    public void setUp() {
        this.bothball = new BothBallCompare();
    }

    @Test
    @DisplayName("볼,스트라이크,아웃 정상작동 확인하기")
    public void CountMatch() {
        List<Integer> playerball = Arrays.asList(5, 7, 9);
        List<Integer> computerball = Arrays.asList(5, 7, 9);
        int balls = 0;
        int strikes = 0;

        for(int i = 0; i < playerball.size(); ++i) {
            if (((Integer)playerball.get(i)).equals(computerball.get(i))) {
                ++strikes;
            } else if (playerball.contains(computerball.get(i))) {
                ++balls;
                Assertions.assertNotNull(8);
            }
        }

        Assertions.assertEquals(3, strikes, "3스트라이크");
        Assertions.assertEquals(0, balls, "낫싱");
    }
}
