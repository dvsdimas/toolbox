import java.util.Scanner;

public class Fibonacci {

  static long calc_fib(int n) {

      if( (n == 0) || (n == 1) ) return n;

      final long[] array = new long[n + 1];

      array[0] = 0;
      array[1] = 1;

      for(int i = 2; i <= n; i++) {
          array[i] = array[i - 1] + array[i - 2];
      }

      return array[n];
  }

  public static void main(String[] args) {
    final Scanner in = new Scanner(System.in);
    final int n = in.nextInt();

    System.out.println(calc_fib(n));
  }

}
