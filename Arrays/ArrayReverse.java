package ArrayLS;

import java.util.Scanner;

public class ArrayReverse {
    static void main(String[] args) {
      //  Scanner sc = new Scanner(System.in);
       // int[] arr = new int[5];
        int [] arr = {1,2,3,5,6,};
        //int n= arr.length;
       // System.out.println("enter the array elements:");

//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
        int[] ans = reverse(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] reverse(int[] arr){
        int n=arr.length;
        System.out.println(n);
        int[] ans = new int[n];
        int j=0;
        for(int i=n-1;i>=0;i--){
            ans[j] =arr[i];
            j++;   //j++ means pehle value assign hogi phir j ki value badhegi
        }

        return ans;
    }

}