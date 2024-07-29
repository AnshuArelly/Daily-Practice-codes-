import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
    
    //int n;
    int factorial=1;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter n value:");
 int n=sc.nextInt();
 for(int i=1;i<=n;i++) {
     factorial*=i;
 }
 sc.close();
 System.out.println("factorial of numberis:" +factorial);
    }
    
}
