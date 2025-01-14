package org.example.sort;

public class InsertSort {

    public static int[] sort(int[] arr) {
        for (int j = 1; j < arr.length; j++) {
            int key = arr[j];
            int i = j - 1;
            while (i >= 0 && arr[i] < key) {
                arr[i + 1] = arr[i];
                i = i - 1;
            }
            arr[i + 1] = key;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{12, 3, 4, 5, 6, 7,8,11,2};
        var x = sort(arr);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+",");
        }

    }
}
