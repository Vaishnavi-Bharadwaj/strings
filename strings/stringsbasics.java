import java.util.*;
public class stringsbasics {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      //concatenatipn
      String fname="abc";
      String lname="xyz";
      String fullname=fname+" "+lname;
      System.out.println(fullname);
    
      //length of the String
      System.out.println(fullname.length());
      
      //to print characters of a string use charAt
      for(int i=0;i<fullname.length();i++){
          System.out.print(fullname.charAt(i));
      }
      System.out.println();

      //comapre
      if(fname.compareTo(lname)==0) //alternate method if(fname.equals(lname))
      {
          System.out.println("strings are equal");
          
      }
      else
          System.out.println("strings are not equal");
      
      //to fetch the substring from a given sentence
      String sentence="My name is abc";
      String name=sentence.substring(11,sentence.length());
      System.out.println(name); 
      
      //to fetch a substring "def" from a given sentence
      String sentence1="abcdef";
      String name1=sentence1.substring(3); //without using the ending index
      System.out.println(name1);
   }
}