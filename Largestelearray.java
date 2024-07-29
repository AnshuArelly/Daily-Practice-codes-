package Arrays;

public class Largestelearray {
    public static void main(String[] args) {
        int arr[]={4,2,5,8,1};     //array initialization
        int max=arr[0];            //array's max element search starts will be from 0 index
                for(int i=1;i<arr.length;i++){
            int current=arr[i];     //storing the ith index value in current variable
if(current>max){                    //comparing ith index current variable with index 0 element of array
    max=current;           
}
        }
System.out.println("largest number in array is:"+max);
}  
        }
    
    

