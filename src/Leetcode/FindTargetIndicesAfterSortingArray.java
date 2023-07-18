package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 2, 3};
        int target = 2;
        List<Integer> indices = targetIndices(nums, target);
        System.out.println(indices);
    }

    static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            //System.out.print(nums[i]);
            if (nums[i] == target) {
                result.add(i);
            }
        }
        return result;
    }
}

