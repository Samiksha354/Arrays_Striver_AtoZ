package Fundamentals;
import java.util.*;

public class maximum_consecutive_ones {
    public static void main(String[] args){
        int[] arr={0, 0, 0, 0, 0, 0, 0, 0};
        int n=arr.length;
        int count=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1) count++;
            else {
                if(ans < count) {ans=count;}
                count=0;

            }
        }
        System.out.print(ans);
    }
}
