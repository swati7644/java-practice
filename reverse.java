public class reverse {
    public static int Reverse(int num){
        int reverse=0;
        while(num > 0){
            int remainder=num %10;
            reverse=reverse*10 + remainder;
            num=num/10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        int n=564;
        System.out.println(Reverse(n));
    }
    
}
