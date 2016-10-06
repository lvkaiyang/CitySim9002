package Function;

import java.util.Random;

/**
 * Created by user on 2016/10/4.
 */
public class RandomGenerator {
    private Random random;

    public RandomGenerator(int seed) {
        this.random = new Random(seed);
    }

    public int Output(int range) {
        int result;
        result = Math.abs(random.nextInt(range));
        return result;
    }

}
