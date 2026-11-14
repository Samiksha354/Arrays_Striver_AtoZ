package Fundamentals;
import java.util.*;

public class left_rotate_array_by_k {
    static void print(int a, int b,int[]arr){
      for(int i=a;i<=b;i++){
          System.out.print(arr[i]+" ");
      }
    }
    public static void main(String[] args){
        int[] arr={3, 4, 1, 5, 3, -5};
        int n=arr.length;
        System.out.print("Enter the left rotation k: ");
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        if(k > n){
            k=k%n;
        }

        print(k,n-1,arr);
        print(0,k-1,arr);


    }
}
