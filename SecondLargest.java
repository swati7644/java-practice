import java.util.*;
public class SecondLargest {
    public static void SecondLAr(int arr[]){
        Arrays.sort(arr);
        int max = arr[arr.length - 2];
       
         
    System.out.println("Second Largest"+max);
    
    }
    public static void main(String[] args) {
        
        int arr[] = {5, 2, 9, 1, 7};
        SecondLAr(arr);
    }
}
