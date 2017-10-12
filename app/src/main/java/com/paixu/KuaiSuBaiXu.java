package com.paixu;

/**
 * Created by TR 105 on 2017/9/18.
 * <p>
 * 快速排序
 * 分治法
 */

public class KuaiSuBaiXu {


    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int index = getIndex(arr, start, end);
            quickSort(arr, 0, index - 1);
            quickSort(arr, index + 1, end);
        }
    }


    public static int getIndex(int[] arr, int start, int end) {
        int i = start, j = end;
        int x = arr[i];
        while (i < j) {
            while (i < j && arr[j] >= x) {
                j--;
            }
            if (i < j) {
                arr[i] = arr[j];
                i++;
            }


            while (i < j && arr[i] < x) {
                i++;
            }

            if (i < j) {
                arr[j] = arr[i];
                j--;
            }
        }
        arr[i] = x;

        int m = i;
        return i;
    }


    public static void main(String[] args) {

        int[] arr = {5, 3, 9, 1, 6, 7, 2, 4, 0, 8};
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }


    }


}
