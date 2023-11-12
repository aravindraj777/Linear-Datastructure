package com.bubblesort;

import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {

        int[] arr={34,21,25,1,5,4,15};
        int[] brr=sort(arr);
        System.out.println(Arrays.toString(brr));
    }

    public static int[] sort(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
