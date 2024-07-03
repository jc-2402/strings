//stringbuilder
import java.util.*;
public class string5{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");
        //i/p
        for(char ch = 'a'; ch<= 'z'; ch++){
            sb.append(ch); //O(26)
        }
        System.out.println(sb);
    }
}