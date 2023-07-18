package Leetcode;

import java.util.HashMap;

public class Contains_duplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        System.out.println(cointainduplicate(arr));
    }

    public static boolean cointainduplicate(int[] arr) {
//
              //SORTING

//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
//        for (int i = 0; i < nums.length-1; i++) {
//            if (nums[i] == nums[i+1]) {
//                return true;
//            }
//
//        }
//        return false;

            //HASH SET

//        HashSet<Integer> set=new HashSet<>();
//        for (int i=0;i<arr.length;i++){
//            int num=arr[i];
//            if(set.contains(num)){
//                return true;
//            }
//            set.add(num);
//        }
//        return false;



        //BIT MANIPULATION

//        int bitMask=0;
//
//        for (int num : arr){
//            int mask =1 << num;
//
//            if (( bitMask & mask ) !=0){
//                return true;
//            }
//
//            bitMask |= mask;
//        }
//        return false;

        // HASH MAPS
        HashMap <Integer,Integer>map = new HashMap<>();

        for (int num:arr){
            if(map.containsKey(num)){
                return true;
            }
            map.put(num,1);
        }
        return false;

    }
}

