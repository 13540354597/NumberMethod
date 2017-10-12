package com.paixu;

/**
 * Created by TR 105 on 2017/9/19.
 */

public class ErFenChaZhaoFa {
    public static void main(String[] args) {

        int arr[] = {1, 4, 8, 9, 12, 20, 42, 55, 66, 78};
        int result = findNumber(arr, 55);
        System.out.println(result);

    }


    public static int findNumber(int arr[], int key) {


        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {

            int index = (end + start) / 2;
            if (key < arr[index]) {
                end = index - 1;
            } else if (key > arr[index]) {

                start = index + 1;

            } else {
                return arr[index];
            }
        }


        return -1;

    }


}
