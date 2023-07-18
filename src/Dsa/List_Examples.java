package Dsa;

import java.util.ArrayList;
import java.util.Collections;

public class List_Examples {
    public static void main(String[] args) {

        java.util.List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        java.util.List<Integer> list2= java.util.List.of(1,3,4);

        java.util.List<Integer> mergedList= new ArrayList<>();

        mergedList.addAll(list1);
        mergedList.addAll(list2);

        Collections.sort(mergedList);

        // Print the merged list
        System.out.println("Merged list: " + mergedList);
    }
}
