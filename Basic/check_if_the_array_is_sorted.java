package Basic;
import java.util.*;

public class check_if_the_array_is_sorted {
    public static void main (String[] args){
        int[] arr={13,99,100};
        int n=arr.length;
        boolean ans=true;
        for(int i=0;i<n-1;i++){
            if(arr[i] >arr[i+1]){ ans=false; }
        }
        System.out.print(ans);
    }
}
