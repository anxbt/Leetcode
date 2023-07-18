package Leetcode;


import java.util.Arrays;

public class array_itterate {
    public static void main(String[] args) {
        int[] arr = {1,5,3,7};
        itterate(arr);

    }

    static void itterate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            Arrays.sort(arr);

            System.out.println(element);
        }
    }
}
