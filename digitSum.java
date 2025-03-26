public class digitSum {
    public static int DigitSum(int num){
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int num=12345;
        System.out.println("Sum of digits in " + num + " is " + DigitSum(num));
    }
    
}
