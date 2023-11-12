import java.util.Arrays;
import java.util.Scanner;

public class Basics1 {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array values");
        int arr[] =new int[7];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        reveerse(arr);
//        System.out.println(Arrays.toString(brr));
//        System.out.println(Arrays.toString(brr));

    }

    public static  void   reveerse(int[] arr){

        for(int i= arr.length-1;i>=0;i--){
            System.out.println(arr[i]);

        }
//            return arr;
    }


}
