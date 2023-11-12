package com.Quicksort;

import java.util.Arrays;

public class Quick2 {

    public static void main(String[] args) {
        int[] arr = {99,23,21,32,100,250,234,210,11,330};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void sort(int[] arr,int first,int last){

        if(first>=last){
            return;
        }
        int f = first;
        int l = last;
        int mid = (first+last)/2;
        int pivot = arr[mid];

        while(f<l){
            while(arr[f]<pivot){
                f++;
            }
            while(arr[l]>pivot){
                l--;
            }


            if (f <= l) {
                int temp = arr[l];
                arr[l] = arr[f];
                arr[f] = temp;
                f++;
                l--;

            }
        }

        sort(arr,f,last);
        sort(arr,first,l);
    }
}
