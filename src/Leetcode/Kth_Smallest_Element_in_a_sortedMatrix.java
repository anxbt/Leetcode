package Leetcode;

public class Kth_Smallest_Element_in_a_sortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        int k = 5;

        int ans = lessEqual( matrix, k);
        System.out.println(ans);

    }

    public static int lessEqual(int[][] matrix, int k) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] arr = new int[rows * cols];
        int index = 0;

        for (int i = 0; i <rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Print the element at index (i, j)
                arr[index]= matrix[i][j] ;
                index++;
            }

        }

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end-start)/2;

            if (k < arr[mid]) {
                end = mid - 1;
            } else if (k > arr[mid]) {
                start = mid + 1;

            } else {
                return arr[ mid];
            }
        }
        return -1;
    }

}
       
    
