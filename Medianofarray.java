package Arrays;
import java.util.*;
public class Medianofarray {
    public static void main(String[] args) {
        int arr[]={2,5,3,1,4,6};
        int n=arr.length;
        double median;
        Arrays.sort(arr);
        if(n%2!=0){
          median=n/2;
        } else{ 
            median=(arr[n/2-1]+arr[n/2])/2.0;
        }
        System.out.println("the median: "+median);
    }
  
    
}
