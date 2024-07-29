package Arrays;

public class Reversearray {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int reverseArray[]=reverse(arr,arr.length);
System.out.println("reverse of an array is:"+ reverseArray);
for (int i=0;i<arr.length;i++) {
    System.out.print(reverseArray[i] + " ");
}
    }
    public static int[]  reverse(int arr[],int n){
    int i=0;
    int j=n-1;
     
while(i<j){
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
i++;
j--;
}
return arr;
    }
}
