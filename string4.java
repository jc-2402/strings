//for a given set of string print largest string
import java.util.*;
public class string4{
     public static void main (String args[]){
        String fruits[] = {"apple","mango","banana"};
        String largest ="";
        for(int i=0; i<fruits.length; i++){
            if( largest.compareTo(fruits[i]) <0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
     }

}