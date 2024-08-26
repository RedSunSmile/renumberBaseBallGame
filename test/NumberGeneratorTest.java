import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import rebaseball.NumberGenerator;

public class NumberGeneratorTest {
    NumberGenerator partnerball = new NumberGenerator();
    Set<Integer> num = new HashSet();
    int numbers = 0;

    public NumberGeneratorTest() {
    }

    @Test
    public void makeRandomNumbers() {
        Random random = new Random();

        while(this.num.size() < 3) {
            this.numbers = random.nextInt(9) + 1;
            this.num.add(this.numbers);
        }

        Assertions.assertThat(this.num).hasSize(3);
        Assertions.assertThat(this.num.stream().allMatch((n) -> {
            return n >= 1 && n <= 9;
        })).isTrue();
    }
}
