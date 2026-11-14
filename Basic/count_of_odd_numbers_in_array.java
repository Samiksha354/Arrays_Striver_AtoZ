package Basic;
import java.util.*;

public class count_of_odd_numbers_in_array {
    public static void main (String[] args){
        int[] arr={23,45,67};
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i] % 2 != 0) count++;
        }
        System.out.println("Total odd are "+count);
    }
}
