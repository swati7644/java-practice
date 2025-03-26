

public class Prime {
    public static boolean  Prime(int num){
      /*   int count = 0;
        if(num <= 2){
            System.out.println(num + " is  a prime number.");
            
        }
        else {
        for(int i=2; i<num; i++){
            if(num % i == 0){
                count++;
            }
        }
            if(count == 0){
            
                System.out.println(num + " is a prime number.");
                
            }
            else{
                System.out.println(num + " is not a prime number.");
            }
    
    
}*/
if (num<=2){
 return true;
}

for (int i=2; i<num; i++){
    if (num%i==0){
        return false;
    }

}

return true;

}
public static void main(String[] args) {
System.out.println(Prime(8));
}
}
