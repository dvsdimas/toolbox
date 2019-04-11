import java.util.*;

public class FibonacciLastDigit {

    static byte getFibonacciLastDigitNaive(int n) {

        if( (n == 0) || (n == 1) ) return (byte)n;

        final byte[] array = new byte[n + 1];

        array[0] = 0;
        array[1] = 1;

        for(int i = 2; i <= n; i++) {
            array[i] = (byte)((array[i - 1] + array[i - 2]) % 10);
        }

        return array[n];

    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(getFibonacciLastDigitNaive(n));
    }
}

