//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
import java.util.*;
public class strings1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		String a[]=new String[n];
		System.out.println("Enter the array elements");
		int totallength=0;
		for(int i=0;i<n;i++){
		    a[i]=sc.next();
		    totallength+=a[i].length();
		}
		System.out.println(totallength);
	}
}
