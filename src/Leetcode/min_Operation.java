package Leetcode;

public class min_Operation {
    public static void main(String[] args) {
        int n = 39;
        System.out.println(minimum(n));
    }

    static int minimum(int n) {
        if (n == 0) {
            return 0;
        }
        for (int exponent = 0; exponent <= n; exponent++) {
            int result = 1;

            for (int i = 0; i < exponent; i++) {
                result *= 2;
            }
                if(n >= result) {
                    n = n - result;
                }
                else if (n <= result) {
                    n = n + result;
                }
        }

        return n;
    }
}
