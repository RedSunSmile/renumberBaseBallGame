import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import org.assertj.core.api.AbstractCollectionAssert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MakePlayerBallTest {
    int mybaseball = 0;
    Set<Integer> userball = new HashSet();

    public MakePlayerBallTest() {
    }

    @Test
    public void makePlayerball() {
        Random random = new Random();

        for(int i = 0; i < 3; ++i) {
            this.mybaseball = random.nextInt(9) + 1;
            this.userball.add(this.mybaseball);
        }

        ((AbstractCollectionAssert)Assertions.assertThat(this.userball).hasSize(3)).allMatch((n) -> {
            return n >= 1 && n <= 9;
        });
    }
}
