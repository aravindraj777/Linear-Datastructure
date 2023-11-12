import java.util.Scanner;

public class Basics {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);



        int[] arr=new int[5];
        System.out.println("enter");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println();


        for(int i= arr.length-1;i>=0;i--){
            System.out.println(arr[i]);

        }
    }
}
