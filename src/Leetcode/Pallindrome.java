package Leetcode;

public class Pallindrome {
    public static void main(String[] args) {
        int x = -121;
        int temp = x;
        int rev = 0;
        while (x > 0) {
            int dig = x % 10;
            rev = rev * 10 + dig;
            x = x / 10;
        }
        if (temp == rev) {
            System.out.println("it is ");
        } else {
            System.out.println("not a pallindrome");
        }

    }
}

