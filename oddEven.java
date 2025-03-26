import java.util.*;
public class oddEven{
    public static  void odd(int x){
        if(x % 2==0){
            System.out.println("It is even number="+x);
        }
        else{
            System.out.println("It is odd number="+x);
        }

}
public static void main(String[] args) {
   Scanner sc= new Scanner(System.in);
   System.out.println("enter a number");
   int x= sc.nextInt();
   odd(x); 
}
}