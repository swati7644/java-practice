import java.util.*;
public class AsciiValue {
    public static void main(String[] args) {
        System.out.println("enter the word whose value you want");
        Scanner sc = new Scanner(System.in);
        char ch=sc.next().charAt(0);
        
        int asciiValue = (int) ch;
        System.out.println("ASCII value of " + ch + " is: " + asciiValue);
        sc.close();
    }
    
}
