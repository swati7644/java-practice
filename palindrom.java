public class palindrom {
    public static void Palindromcheck(int n){
        int rev=0;
        int b=n;
        while(n>0){
           int rem=n%10;
           rev=rev*10+rem;
           n=n/10;
        }
        if(rev==b){
            System.out.println(b+" is a palindrome");
        }
        else{
            System.out.println(b+" is not a palindrome");
        }

    }
    public static void main(String[] args) {
        Palindromcheck(121);
    }
}
