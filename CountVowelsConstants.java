
import java.util.Scanner;

public class CountVowelsConstants {
    public static void CountVCS(String str,int length){
        int vowelCount=0;
        int consonantCount=0;
        int SpaceCount=0;

        for(int i=0;i<length;i++){
            char ch=Character.toLowerCase(str.charAt(i));
            if(ch=='a'||ch=='e' ||ch=='i'||ch=='o'||ch=='u'){
                vowelCount++;
        
    }
    else if(ch==' '){
                SpaceCount++;
            }
            else{
                consonantCount++;
            }
        }
        System.out.println("Number of vowels: "+vowelCount);
        System.out.println("Number of consonants: "+consonantCount);
        System.out.println("Number of spaces: "+SpaceCount);
    
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    
    int length=str.length();
    CountVCS(str,length);
}
}

