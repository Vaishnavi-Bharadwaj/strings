//to reverse a string using StringBuilder class
import java.util.*;
public class Stringbuilder1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String input=sc.nextLine();
        sb.append(input);
        sb.reverse();
        System.out.println(sb);


    }
}


