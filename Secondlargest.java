package Arrays;

public class Secondlargest {
    public static void main(String[] args) {
        int arr[]={3,5,1,2};     
int secondlargest=sslarge(arr,arr.length);
System.out.println("the second largest ele "+secondlargest);
        }
    
public static int sslarge(int arr[], int n){
    int largest= arr[0];
        int slargest=arr[0];
        for(int i=1;i<n;i++){       
if(arr[i]>largest){
    slargest=largest;
    largest=arr[i];
}else if(arr[i]>slargest && arr[i]!=largest){
slargest=arr[i];
    }
}
return slargest;
}
}

