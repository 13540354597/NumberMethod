package com.paixu;

/**
 * Created by TR 105 on 2017/9/19.
 */

public class ChaRuPaiXu {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 6, 7, 2, 4, 0, 8};
        method(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }


    public static void method(int arr[]) {

        int temp = 0;


        for (int i = 1; i <= arr.length - 1; i++) {

            temp = arr[i];
            int j = 0;
            for (j = i; j > 0; j--) {

                if (temp > arr[j]) {
                    break;
                } else if (temp < arr[j]) {
                    arr[j + 1] = arr[j];

                }

            }

            if (arr[j] != temp) {
                arr[j] = temp;
            }


        }

    }
}
