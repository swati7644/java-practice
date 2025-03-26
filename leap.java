import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input year from user
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        // Check for leap year
        boolean isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        
        // Display result
        if (isLeap) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
        
        scanner.close();
    }
}

    

