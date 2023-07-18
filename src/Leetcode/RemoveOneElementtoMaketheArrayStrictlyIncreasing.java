package Leetcode;

public class RemoveOneElementtoMaketheArrayStrictlyIncreasing {
    public static void main(String[] args) {
        int[] nums = {1, 2,5, 3};
        System.out.println(canBeIncreasing(nums));
    }

    public static boolean canBeIncreasing(int[] nums) {
        int count = 0;

        for (int i = 1; i < nums.length; i++)
            if (nums[i] <= nums[i - 1]) {
                count++;
                if (count > 1)
                    return false;
                if (i > 1 && nums[i] <= nums[i - 2])
                    nums[i] = nums[i - 1];
            }

        return true;
    }
}