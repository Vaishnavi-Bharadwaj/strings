import java.util.*;
public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("tony");
        System.out.println(sb);
        //to print char at index 0
        System.out.println(sb.charAt(0));
        
        //to set a different char at index 0
        sb.setCharAt(0,'p');
        System.out.println(sb);

        //to add another char at index 0
        sb.insert(0,'s');
        System.out.println(sb);

        //to add another char at any index
        sb.insert(3,'n');
        System.out.println(sb);

        //to delete a char from index 3 recently added
        sb.delete(3,4); //3 is the start index, 4 is the end index
        System.out.println(sb);

        //to delete the first char
        sb.delete(0,1); 
        System.out.println(sb);

        //to delete the char at index 2
        sb.delete(2,3); 
        System.out.println(sb);

        //to append a char 
        sb.append('y'); 
        System.out.println(sb);

        //to find length 
        System.out.println(sb.length());
    }
}
