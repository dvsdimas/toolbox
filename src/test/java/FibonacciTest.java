import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void testF10() {
        Assert.assertEquals(55, Fibonacci.calc_fib(10));
    }

    @Test
    public void testF20() {
        Assert.assertEquals(6765, Fibonacci.calc_fib(20));
    }

}
