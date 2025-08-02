package org.example.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ZigZagConversion {

    public static void main(String[] args) {
        String input = "AB";
        int numRows = 1;
        new ZigZagConversion().convert(input, numRows);
    }

    String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder[] data = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            data[i] = new StringBuilder();
        }
        int o = 1;
        int p = 0;

        for (int i = 0; i < s.length(); i++) {
            data[p].append(s.charAt(i));
            if (o == 1) {
                p++;
            }
            if (o == -1) {
                p--;
            }
            if (p >= numRows - 1) {
                o = -1;
            }
            if (p == 0) {
                o = 1;
            }
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder datum : data) {
            result.append(datum.toString());
        }
        return result.toString();
    }
}
