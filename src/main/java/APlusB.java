import java.util.Scanner;

public class APlusB {

    private static int sumOfTwoDigits(final int first_digit, final int second_digit) {
        return first_digit + second_digit;
    }

    public static void main(String[] args) {

        final Scanner s = new Scanner(System.in);

        final int a = s.nextInt();

        final int b = s.nextInt();

        System.out.println(sumOfTwoDigits(a, b));
    }

}