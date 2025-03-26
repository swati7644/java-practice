public class lcm {
    public static int findLCM(int a, int b) {
        int lcm = (a * b) / gcd(a, b);
        return lcm;
    }
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
            return gcd(b, a % b);  // recursion
    
    }
public static void main(String[] args) {
    int a=18;
    int b=12;
    System.out.println("LCM of " + a + " and " + b + " is " + findLCM(a, b));
}
    
}
