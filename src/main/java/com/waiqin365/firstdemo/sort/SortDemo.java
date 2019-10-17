package com.waiqin365.firstdemo.sort;

public class SortDemo {
    public static void main(String[] args) {
        int[] a = {6, 4, 8, 1, 9, 5};
        quickSort(a, 0, 5);
        for (int i = 0; i < a.length; i++) {
            System.out.printf((a[i]) + " ");
        }
    }

    /**
     * 冒泡排序
     *
     * @param arr
     */
    static void bubbleSort(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    //交换相邻两个数
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 直接插入排序
     *
     * @param arr
     */
    public static void straightSort(int[] arr) {
        int current;//当前要插入的数
        for (int i = 1; i < arr.length; i++) {//第一个数不需要排序
            current = arr[i];
            int j = i - 1;    //序列元素个数
            //从后往前循环，将大于当前插入数的向后移动
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];  //元素向后移动
                j--;
            }
            arr[j + 1] = current;  //找到位置，插入当前元素
        }
    }

    /**
     * 快速选择排序
     *
     * @param arr
     * @param left
     * @param right
     */
    public static void quickSort(int[] arr, int left, int right) {
        int f, t, rtemp, ltemp;
        ltemp = left;
        rtemp = right;
        f = arr[(left + right) / 2];        //分界值
        while (ltemp < rtemp) {
            while (arr[ltemp] < f) {
                ++ltemp;
            }
            while (arr[rtemp] > f) {
                --rtemp;
            }
            if (ltemp <= rtemp) {
                t = arr[ltemp];
                arr[ltemp] = arr[rtemp];
                arr[rtemp] = t;
                rtemp--;
                ltemp++;
            }
        }
        if (left < rtemp) {
            quickSort(arr, left, ltemp - 1);        //递归调用
        }
        if (ltemp < right) {
            quickSort(arr, rtemp + 1, right);        //递归调用
        }
    }
}
