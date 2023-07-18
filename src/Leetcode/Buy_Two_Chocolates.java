package Leetcode;

 import java.util.Arrays;
public class Buy_Two_Chocolates {
    public static void main(String[] args) {
        int[]prices={98,54,6,34,66,63,52,39};
        int money=62;
        System.out.println(buyChoco(prices, money));
    }
   public static int buyChoco(int [] prices,int money) {
       Arrays.sort(prices);
       int sum=prices[0]+prices[1];
       if (money>=sum){
           return (money-sum);
       }
       else {
           return money;
       }


   }
}
