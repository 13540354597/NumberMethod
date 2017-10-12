package com.paixu;

/**
 * Created by TR 105 on 2017/9/18.
 */

public class MaoPaoPaixu {

    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 6, 7, 2, 4, 0, 8};
        maoPaoPaixu2(arr);
        for (int i : arr) {
            System.out.println(i);
        }


    }

    private static void maoPaoPaixu(int arr[]) {

        for (int times = 1; times <= arr.length - 1; times++) {
            for (int i = 1; i <= arr.length - times; i++) {
                if (arr[i - 1] > arr[i]) {
                    svap(arr, i - 1, i);
                }
            }
        }

    }

    private static void maoPaoPaixu2(int arr[]) {

        int length = arr.length;

        while (length > 1) {
            for (int i = 1; i < length - 1; i++) {

                if (arr[i - 1] > arr[i]) {
                    svap(arr, i - 1, i);
                }


            }
            length--;
        }


    }

    private static void svap(int[] arr, int i1, int i2) {

        int temp = arr[i1];

        arr[i1] = arr[i2];
        arr[i2] = temp;


    }
}
