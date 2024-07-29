package Arrays;

public class Secondsmallest {
    public static void main(String[] args) {
        int arr[]={2,5,1,3};
        int secondsmallest=ssmall(arr,arr.length);
    System.out.println("the second smallest number in array is:"+ secondsmallest);
    }
    public static int ssmall(int arr[],int n){
int smallestnum=arr[0];
int secondsmallestnum=arr[0];
for(int i=1;i<n;i++){
    if(arr[i]<smallestnum){
        secondsmallestnum=smallestnum;
        smallestnum=arr[i];

    }
    else if(arr[i]<secondsmallestnum && arr[i]!=smallestnum) {
        secondsmallestnum=arr[i];
    }
}
return secondsmallestnum;
    }
}
