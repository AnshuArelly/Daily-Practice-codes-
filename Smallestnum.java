package Arrays;
import java.util.Arrays;
public class Smallestnum {
    public static void main(String[] args) {
      
        int arr[]={2,5,1,3,0};
     
        System.out.print("The smallest element in an array is:"+smallest(arr));
    }
public static int smallest( int arr[]) {
    Arrays.sort(arr);
    return arr[0];
} 
}
