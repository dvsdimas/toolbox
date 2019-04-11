import java.util.*;

public class FibonacciLastDigit {

    static byte getFibonacciLastDigitNaive(int n) {

        if( (n == 0) || (n == 1) ) return (byte) n;

        final byte[] array = new byte[n];

        array[0] = 0;
        array[1] = 1;

        return 0;

    }
// 1, 2, 3, 4, 5, 6, 7,  8,  9, 10
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(getFibonacciLastDigitNaive(n));
    }
}

