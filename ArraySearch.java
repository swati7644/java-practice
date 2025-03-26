import java.util.Scanner;
public class ArraySearch {
    public  static int linearSearch(int arr[],int key )
{
    for(int i=0;i<arr.length;i++){
        if(arr[i]==key){
            return i;
        }
        
    }
    return -1;
}  
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no of elements");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter elements");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
}  
int key=5;
 int index=linearSearch(arr,key);
 if(index==-1){
    System.out.println("NOT FOUND");
 }
 else{
    System.out.println("found at index " + index);

 }
}
}