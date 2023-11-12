package com.selectionsort;

import java.util.Arrays;

public class Selection {

    public static void main(String[] args) {

        int[] arr={54,12,8,10,32,47};
        int[] brr= sort(arr);
        System.out.println(Arrays.toString(brr));

    }
    public static int[] sort(int[] arr){

        for(int i=0;i<arr.length;i++){
            int min=i;
            for (int j=i+1;j< arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}
