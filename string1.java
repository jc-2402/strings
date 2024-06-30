
import java.util.Scanner;

//basics of strings
public class string1{
    public static void printletters(String fulln){
        for(int i=0; i<fulln.length(); i++){
            System.out.print(fulln.charAt(i)+ " ");
        }
    }
    public static void main(String args[]){
        String str = "abc";
        System.out.println(str);
        //or
        String str1 = new String("xy@");
        System.out.println(str1);

        //i/p
        Scanner s = new Scanner(System.in);
        String name = s.next();
        System.out.println(name);
        Scanner sc = new Scanner(System.in);
        String fullname = sc.nextLine();
        System.out.println(fullname);

        //to find length
        System.out.println("length of string : "+ fullname.length());
        //concatenation - use +
        String fn = "Jiya";
        String ln = "Chowdhury";
        String fulln = fn + " " + ln;
        System.out.println(fulln);

        //to find a character 
        //Q - print all letters of a character
        printletters(fulln);

    }
}