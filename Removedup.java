package Arrays;

// removing duplicate elements from array
import java.util.Arrays;
public class Removedup {
    public static void main(String[] args) {
int arr[]={2,3,2,3,2,6,6,6};
Arrays.sort(arr);
System.out.println("the sorted array:");
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]+" ");
}
System.out.println();
int result=removeduplicate(arr); 
System.out.println("the array without dups:");
for(int i=0;i<result;i++){
    System.out.println(arr[i]+" ");
}
System.out.println();
    } 
    public static int removeduplicate(int arr[]){
int i=0;
for(int j=1;j<arr.length;j++){
    if(arr[i]!=arr[j]){
        i++;
        arr[i]=arr[j];
    }
}
return i+1;
    }
}
