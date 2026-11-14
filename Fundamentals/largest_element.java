package Fundamentals;
import java.util.*;

public class largest_element {
   public static void main(String [] args){
       int[] arr={56,89,230,10,1,-1,90};
       int max=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
           if(arr[i]>max) max=arr[i];
       }
       System.out.println("The max element is "+max);
   }
}
