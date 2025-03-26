import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the first number :");
        int a= sc.nextInt();
        System.out.println("enter the second number :");
        int b= sc.nextInt();
        System.out.println("enter the operator (+,-,*,/,%)");
        char operator= sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("sum is "+(a+b));
                break;
            case '-':
                System.out.println("difference is "+(a-b));
                break;
            case '*':
                System.out.println("product is "+(a*b));
                break;
            case '/':
                if(b!=0)
                    System.out.println("quotient is "+(a/b));
                else
                    System.out.println("Error: Division by zero");
                break;
            case '%':
                System.out.println("Remainder is :- "+(a%b));
                break;
            default:
                System.out.println("Invalid operator");
        }
    
    }  
    
}
