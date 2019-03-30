import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class MaxPairwiseProductTest {

    @Test
    public void stressTest() {

        int count = ThreadLocalRandom.current().nextInt(1, 1000);

        while (count-- > 0) {

            final int size = ThreadLocalRandom.current().nextInt(2, 1000);

            final int[] array = new int[size];

            for(int i = 0; i < size; i++) {
                array[i] = ThreadLocalRandom.current().nextInt(0, size);
            }

            try {
                final long result = MaxPairwiseProduct.getMaxPairwiseProduct(array);
                final long resultFast = MaxPairwiseProduct.getMaxPairwiseProductFast(array);

                Assert.assertEquals(result, resultFast);
            } catch (Throwable th) {
                System.out.println(Arrays.toString(array));
            }
        }
    }

    @Test
    public void perfTest() {

        final int size = 2 * 100_000;

        final int[] array = new int[size];

        for(int i = 0; i < size; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(0, size);
        }

        final long start = System.currentTimeMillis();

        final long result = MaxPairwiseProduct.getMaxPairwiseProductFast(array);

        final double spent = (System.currentTimeMillis() - start) / 1000;

        System.out.println("Result - [" + result + "]. Calculation time - [" + spent + "]");

        Assert.assertTrue(spent < 1);
    }

    @Test
    public void simpleTest1() {

        final int[] array = {5, 6, 2, 7, 4};

        final long result = MaxPairwiseProduct.getMaxPairwiseProductFast(array);

        Assert.assertEquals(42, result);

    }

    @Test
    public void simpleTest2() {

        final int[] array = {1, 2, 3};

        final long result = MaxPairwiseProduct.getMaxPairwiseProductFast(array);

        Assert.assertEquals(6, result);

    }

    @Test
    public void simpleTest3() {

        final int[] array = {7, 5, 14, 2, 8, 8, 10, 1, 2, 3};

        final long result = MaxPairwiseProduct.getMaxPairwiseProductFast(array);

        Assert.assertEquals(140, result);

    }

    @Test
    public void simpleTest4() {

        final int[] array = {100_000, 90_000};

        final long result = MaxPairwiseProduct.getMaxPairwiseProductFast(array);

        Assert.assertEquals(9_000_000_000L, result);

    }



}
