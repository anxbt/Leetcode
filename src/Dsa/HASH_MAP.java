package Dsa;

import java.util.HashMap;

public class HASH_MAP {
    public static void main(String[] args) {
        HashMap< String,Integer>empIds = new HashMap<>();

        empIds.put("john",1234);
        empIds.put("Jerry",54321);
        empIds.put("carl",6969);
        System.out.println(empIds);

        System.out.println(empIds.get("carl"));

        System.out.println(empIds.containsKey("penny"));

        System.out.println(empIds.containsValue(69));

        empIds.put("ab",98614);
        System.out.println(empIds);

        empIds.replace("bc",777);
        System.out.println(empIds);

        empIds.remove("ab");
        System.out.println(empIds);
    }
}
