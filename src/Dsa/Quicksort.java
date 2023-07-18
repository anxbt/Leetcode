package Dsa;

import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3,2, 1};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
    }
    static void sort(int[] nums, int low, int high) {
        //Base Condition
        if (low >= high) {
            return;
        }
        int strt = low;
        int end = high;
        int mid = strt + (end - strt) / 2;
        int pivot = nums[mid];

        while (strt <= end) {

            while (nums[strt] < pivot) {
                strt++;
            }
            while (nums[end] > pivot) {
                end--;
            }
            if (strt <= end) ;
            //Swap
            int temp = nums[strt];
            nums[strt] = nums[end];
            nums[end] = temp;
            strt++;
            end--;

        }
    }

    public static class Matrix_traverse {
        public static void main(String[] args) {
            int[][] arr = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
            traverse(arr);
        }

        static void traverse(int[][] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

