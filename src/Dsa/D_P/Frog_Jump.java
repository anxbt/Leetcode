package Dsa.D_P;
import java.util.Arrays;


public class Frog_Jump {
    public static void main(String[] args) {


        int height[] = {30, 10, 60, 10, 60, 50};
        int minEnergyRequired = minEnergy(height);
        System.out.println("Minimum energy required: " + minEnergyRequired);
    }

    public static int minEnergy(int[] height) {
        int N = height.length;
        int[] memo = new int[N];
        Arrays.fill(memo, Integer.MAX_VALUE);
        memo[0] = 0;

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                int energy = Math.abs(height[i] - height[j]);
                memo[i] = Math.min(memo[i], memo[j] + energy);
            }
        }

        return memo[N-1];
    }
}