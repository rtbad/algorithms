package org.example.leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        var r = new ReverseInteger().reverse(1534236469);
        System.out.println(r);
    }

    public int reverse(int x) {
        StringBuilder r = new StringBuilder();
        if (x == 0) return 0;
        if (x < 0) {
            r.append("-");
            x = x * (-1);
        }
        while (x > 0) {
            r.append(x % 10);
            x = x / 10;
        }
        try {
            Integer.parseInt(r.toString());
            return Integer.parseInt(r.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
