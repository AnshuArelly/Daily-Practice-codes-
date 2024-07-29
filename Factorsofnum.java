import java.util.Scanner;
public class Factorsofnum {
    public static void main(String[] args) {
    int  n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number n:");
        n=sc.nextInt();
  for(int i=1; i<=n;i++) {
    if(n%i==0) {  //it is logic to find factor of any number
        System.out.println(i+ " is a factor of given number " +n);
    } 
    
  }
  sc.close();
    }
    
}
