package Dsa;

import java.util.HashSet;

public class HashSET {
    public static void main(String[] args) {
        HashSet <String>  names= new HashSet<>();

        names.add("jesse");
        names.add("walter");
        names.add("skyler");

        names.remove("walter");


        System.out.println(names);

        System.out.println(names.contains("skyler"));

        //iterating
        for(String name:names){
            System.out.println(name);
        }
               //OR
        names.forEach(System.out::println); //LAMBDA

//        List<Integer>numbeList = new ArrayList<>();
//        numberList.add(1);
//        numberList.add(2);
//
//        System.out.println(numberList);





    }
}
