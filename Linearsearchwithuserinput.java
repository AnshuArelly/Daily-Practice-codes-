package Arrays;
import java.util.Scanner;
public class Linearsearchwithuserinput {
    public static void main(String[] args) {
        int arr[]={2,4,6,8};
       int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num to search:");
int searchnum=sc.nextInt();
for(i=0;i<arr.length;i++){
    if(arr[i]==searchnum){
        System.out.println("element found at:"+i);
        break;
    }
    sc.close(); 
    
}

if(arr[i]!=searchnum){
    System.out.println("element not found");
}
//sc.close();
    }
     
}
