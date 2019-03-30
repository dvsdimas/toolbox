import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {

    static long getMaxPairwiseProduct(int[] numbers) {

        final int n = numbers.length;

        long max_product = 0;

        for (int first = 0; first < n; ++first) {
            for (int second = first + 1; second < n; ++second) {
                max_product = Math.max(max_product, (long)numbers[first] * (long)numbers[second]);
            }
        }

        return max_product;
    }

    static long getMaxPairwiseProductFast(int[] numbers) {

        long moreMax = -1, lessMax = -1, val;

        for (int i = 0; i < numbers.length; i++) {

            val = numbers[i];

            if(i == 0) {
                moreMax = val;
                continue;
            }

            if(val > moreMax) {
                lessMax = moreMax;
                moreMax = val;
                continue;
            }

            if(val > lessMax) {
                lessMax = val;
            }
        }

        assert moreMax >= 0;
        assert lessMax >= 0;

        return moreMax * lessMax;
    }

    public static void main(String[] args) {

        final FastScanner scanner = new FastScanner(System.in);
        final int n = scanner.nextInt();
        final int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println(getMaxPairwiseProductFast(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}