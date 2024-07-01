//check if a string is palindrome or not
public class string2{
    public static boolean palindromeornot(String str){
        for(int i=0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                  return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(palindromeornot(str));
    }
}