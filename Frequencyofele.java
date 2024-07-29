package Arrays;
import java.util.HashMap;
public class Frequencyofele {
    public static void main(String[] args) {
        int arr[]={1,2,5,2,1,3,3};
       frequency(arr,arr.length);
    }
    public static void frequency(int arr[],int n){
       HashMap<Integer,Integer>map=new HashMap<>();
for(int i=0;i<n;i++){
if(map.containsKey(arr[i])){
    map.put(arr[i],map.get(arr[i])+1);
} else{
    map.put(arr[i],1);
}
}
for (HashMap.Entry<Integer,Integer> entry : map.entrySet())
    {
        System.out.println(entry.getKey() + " " + entry.getValue());
    }
    }
    }
    

