import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fibonacci {

  private final static Map<Integer, Long> map = new HashMap<>();

  static long calc_fib(int n) {

    if (n <= 1) return n;

    return map.computeIfAbsent(n, (i) -> calc_fib(i - 1) + calc_fib(i - 2));
  }

  public static void main(String[] args) {
    final Scanner in = new Scanner(System.in);
    final int n = in.nextInt();

    System.out.println(calc_fib(n));
  }

}
