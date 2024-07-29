package Patterns;

public class Pattern5 { public static void main(String[] args) {
    int n=6;
    int i;
    for(i=0;i<2*n;i++){ //i=row j=col
        int totalColsInRow=i>n?2*n-i : i;
for(int j=0;j<totalColsInRow;j++){
    System.out.print("*");
}
System.out.println();
}

    }
}
