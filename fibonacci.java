import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n=sc.nextInt();
        int first=0;
        int second=1;
        int next ;
        for(int i = 0; i<=n ; i++){
            System.out.print(first +"  ");
            next=first+second;
            first=second;
            second=next;
        }
    
}
}
