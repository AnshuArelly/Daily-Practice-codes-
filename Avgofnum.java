import java.util.Scanner;
public class Avgofnum {
    public static void main(String[] args) {
       int sum=0;
       int count=0;
       int avg;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter your inputs:");
       int i=sc.nextInt();
       while(i>=0){ 
        sum+=i;
        count++;

System.out.println("enter next input:");
i=sc.nextInt();

       }
       if(count>0){
              avg=sum/count;
              System.out.println("avg of your inputs:" + avg);  
       } else{
              System.out.println("enter your inputs:");
       }
 
       sc.close();
}
}
       

    
