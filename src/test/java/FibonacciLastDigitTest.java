import org.junit.Assert;
import org.junit.Test;

public class FibonacciLastDigitTest {

    @Test
    public void testF10() {
        Assert.assertEquals(5, FibonacciLastDigit.getFibonacciLastDigitNaive(10));
    }

    @Test
    public void testF20() {
        Assert.assertEquals(5, FibonacciLastDigit.getFibonacciLastDigitNaive(20));
    }


    @Test
    public void testF239() {
        Assert.assertEquals(1, FibonacciLastDigit.getFibonacciLastDigitNaive(239));
    }

    @Test
    public void testF9999() {
        Assert.assertEquals(1, FibonacciLastDigit.getFibonacciLastDigitNaive(9999));
    }



}
