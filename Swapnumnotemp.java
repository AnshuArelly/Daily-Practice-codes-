 import java.util.Scanner;
 public class Swapnumnotemp {
    public static void main(String[] args) {
        int a,b;
        System.out.println("enter a :");
        System.out.println("enter b :");
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("numbers before swap: a="  +a+ ", b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("numbers after swap: a=" +a + ", b=" +b);
       sc.close();
    }
    
}
    
