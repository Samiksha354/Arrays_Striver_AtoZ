package Fundamentals;
import java.util.*;

public class linear_search {
    public static void main(String [] args){
        int[] arr={56,89,23,10,1,-1,90};
        System.out.print("Enter the element you want to find :");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        boolean ans=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == number) {
                ans=true;
                break;
            }

        }
        System.out.print(ans);
    }
}
