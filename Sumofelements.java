package Arrays;

import java.util.stream.IntStream;

public class Sumofelements {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2};                                            //using java collection input stream
       
        int sum = IntStream.of(arr).sum();
        int avg=(sum)/arr.length;
    
        System.out.println("the sum of elements in an arary:"+ sum);
    
        System.out.println("the avg of elements in an arary:"+ avg);
    }
    
}

