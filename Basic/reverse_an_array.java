package Basic;
import java.util.*;

public class reverse_an_array {
    public static void main (String[] args){
        int[] arr={23,45,67};
        int n=arr.length;

        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
