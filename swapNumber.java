import java.util.*;
public class swapNumber {
    public static void Swap(int i, int j) {
        i=i+j;
        j=i-j;
        i=i-j;
        System.out.println("number After Swaaping  i ="+i+" j = "+j);

    
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two numbers:");
    int i=sc.nextInt();
    int j = sc.nextInt();
    Swap(i, j);
}
}
