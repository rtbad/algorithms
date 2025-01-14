package org.example.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestWithoutRepeating {

    public static void main(String[] args) {
        String s = "pwwkew";
        int r = lengthOfLongestSubstring(s);
        System.out.println(r);
    }
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            isAlreadyThere(arr, s.charAt(i));
        }

        return count(arr);
    }

    public static int count(char[] arr) {
        char special = '\000';
        int i =0;
        while(arr[i]!=special){
            i++;
        }
        return i;
    }

    public static char[] isAlreadyThere(char[] arr, char c) {
        boolean isSet = false;
        char special = '\000';
        int i =0;
        while(arr[i]!=special){
            if (arr[i] == c) {
                isSet = true;
                break;
            }
            i++;
        }
        if(!isSet){
            arr[i]=c;
        }
        return arr;
    }

}
