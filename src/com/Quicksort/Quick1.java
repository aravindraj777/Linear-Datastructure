package com.Quicksort;

import java.util.Arrays;

public class Quick1 {
    public static void main(String[] args) {
        int[] arr = {100,45,67,12,44,11,200,150,300};
//        int first=0;int last = arr.length-1;
        Quick(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    public static void Quick(int [] arr ,int first,int last){

        if(first>=last){
            return;
        }

        int s = first;
        int l = last;
        int middle = (l+s)/2;
        int pivot = arr[middle];

        while(s<=l){
            while(arr[s]<pivot){
                s++;

            }
            while (arr[l]>pivot){
                l--;
            }

            if(s<=l){
                int temp = arr[s];
                arr[s] = arr[l];
                arr[l] = temp;
                l--;
                s++;
            }
        }
        Quick(arr,first,l);
        Quick(arr,s,last);
    }
}
