package pl.gawly;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    Solution s = new Solution();

    @Test
    public void testZero() {
        Assert.assertEquals(0, s.solution(new int[]{0}));
    }

    @Test
    public void testEx1() {
        Assert.assertEquals(5, s.solution(new int[]{0, 1, 0, 1, 1}));
    }

    @Test
    public void testEx2() {
        Assert.assertEquals(1, s.solution(new int[]{0, 1}));
    }

    @Test
    public void testLimit1() {
        int[] cars = new int[1000000];
        for (int i = 500001; i < cars.length; i++) {
            cars[i] = 1;
        }
        Assert.assertEquals(-1, s.solution(cars));
    }
}
