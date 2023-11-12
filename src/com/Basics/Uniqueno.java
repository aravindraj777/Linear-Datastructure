package com.Basics;

import java.util.Arrays;
import java.util.Scanner;

public class Uniqueno {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array values");
        int [] arr=new int[7];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        unique(arr);

    }

    public static void unique(int [] arr){
    int n= arr.length;
        for(int i=0;i< n;i++) {
            int flag = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j] && i != j) {
                    flag = 1;
                    break;

                }
            }
            if (flag == 0) {
                for (int j = i; j < n; j++) {
                    arr[j] = arr[j + 1];
                }

                i--;
                n--;
            }

        }
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

//        return arr;
    }
}
