package DSA.Array.Ques;

import java.util.Scanner;

public class PrefixSum {
    static void PrintArray(int arr[]){
        for (int i = 0 ;i < arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();

    }
    static int[] makePrefixSumArray(int[] arr){
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];

        for (int i= 1 ; i < n; i++){
            pref[i] = pref[i-1] + arr[i];
        }
          return pref;
    }


    public static void main(String[] args) {
        System.out.println("Enter the size of Array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter "+n+" Arrays elements ");
        for (int i = 0 ; i < arr.length ;i++ ){
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array : ");
        PrintArray(arr);

        int[] pref = makePrefixSumArray(arr);
        System.out.println("Prefix sum Array");
        PrintArray(pref);


    }
}
