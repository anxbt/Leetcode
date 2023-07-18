package Leetcode;

//import java.util.ArrayList;
import java.util.*;

public class merge_2_sortedlist {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        List<Integer> list2 = List.of(1, 3, 4);

        List<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);

        Collections.sort(mergedList);

        // Print the merged list
        System.out.println("Merged list: " + mergedList);
    }
}
