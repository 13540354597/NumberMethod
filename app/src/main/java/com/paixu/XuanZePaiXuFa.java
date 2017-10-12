package com.paixu;

/**
 * Created by TR 105 on 2017/9/19.
 */

public class XuanZePaiXuFa {

    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 6, 7, 2, 4, 0, 8};

        method(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }


    public static void method(int arr[]) {

        int minIndex = 0;

        for (int i = 0; i <= arr.length - 1; i++) {

            minIndex=i;
            for (int j = i + 1; j <= arr.length - 1; j++) {

                if (arr[minIndex] > arr[j]) {
                    minIndex = j;

                }

            }
            if (i != minIndex) {
                svap(arr, minIndex, i);

            }


        }

    }

    private static void svap(int[] arr, int i1, int i2) {

        int temp = arr[i1];

        arr[i1] = arr[i2];
        arr[i2] = temp;


    }
}
