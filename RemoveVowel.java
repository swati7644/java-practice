public class RemoveVowel {
    public static String removeVowels(String str) {
        //return str.replaceALL("[AEIOUaeiou]", "")
        
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
                if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' &&
                 c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                sb.append(c);
                }
                }
                return sb.toString();

        }
    
    public static void main(String[] args) {
        String str="aejkla";
        System.out.println(removeVowels(str));
    }
}