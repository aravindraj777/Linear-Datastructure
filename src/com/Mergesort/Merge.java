//package com.Mergesort;
//
//import java.util.Arrays;
//
//public class Merge {
////   import java.util.Arrays;
//
//    public class MergeSort2 {
//        public static void main(String[] args) {
//            int[] array = {900, 100, 400, 200, 600, 1000, 800, 300, 500, 700};
//            int[] result = merge(array);
//            System.out.println(Arrays.toString(result));
//
//
//        }
//
//
//      public  static int[] merge(int[] array) {
//
//            if (array.length <= 1) {
//                return array;
//            }
//            int mid = array.length / 2;
//
//            int[] left = merge(Arrays.copyOfRange(array, 0, mid));
//            int[] right = merge(Arrays.copyOfRange(array, mid, array.length));
//            return mergeSort(left,right);
//        }
//
//        public int[] mergeSort(int[] firstHalf, int[] secondHalf) {
//            int[] newArray = new int[firstHalf.length + secondHalf.length];
//            int i = 0;
//            int j = 0;
//            int index = 0;
//
//            while (i < firstHalf.length && j < secondHalf.length) {
//
//                if (firstHalf[i] <= secondHalf[j]) {
//                    newArray[index] = firstHalf[i];
//                    index++;
//                    i++;
//                } else {
//                    newArray[index] = secondHalf[j];
//                    index++;
//                    j++;
//                }
//            }
//            while (i < firstHalf.length) {
//                newArray[index] = firstHalf[i];
//                index++;
//                i++;
//            }
//            while (j < secondHalf.length) {
//                newArray[index] = secondHalf[j];
//                index++;
//                j++;
//            }
//            return newArray;
//        }
//    }
//}
//
//
//
