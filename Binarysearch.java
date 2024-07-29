package Arrays;

public class Binarysearch {
    public static void main(String[] args) {
        int arr[]={1,3,6,9,8,12,17,18,22};
        int target=18;
        
       
int ans=Binarysearch.Search( arr, target);
System.out.println(ans);
    }

    static int Search(int arr[],int target){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int mid= left+(right-left)/2;
            if(target>arr[mid]){
                left=mid+1;
            } else if(target<arr[mid]){
                right=mid-1;
            } else 
            return mid;
        }
return -1;
    }
}
    

