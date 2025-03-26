import java.util.*;
public class amstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arm=0;
       int n=sc.nextInt();
       int d=n;
       while(n>0){
         int r=n%10;
         arm=arm+r*r*r;
         n=n/10;
       }
       if(d==arm){
         System.out.println(d+" is an Armstrong number");
       }
       else{
         System.out.println(d+" is not an Armstrong number");
       }
    }
    
}
