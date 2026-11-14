package Fundamentals;
import java.util.*;

public class second_largest {
    public static void main(String [] args){
        int[] arr={56,89,230,10,1,-1,90};
        int max=Integer.MIN_VALUE;
        int submax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) {
                submax = max;
                max = arr[i];
            }
            else if(arr[i] > submax && arr[i] != max){
                     submax=arr[i];
            }

        }
          if (submax == Integer.MIN_VALUE) {
        System.out.println("Second largest does not exist");
    } else {
        System.out.println("Second Largest: " + submax);
    }
    }
}