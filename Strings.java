package string;
import java.util.Scanner;
public class Strings
{  
	public static void main(String args[])
	{  
		String s1="java";  
		char ch[]={'s','t','r','i','n','g','s'};  
		String s2=new String(ch);  
		String s3=new String("example");  
		String name;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter name");  
		name=sc.next();
		System.out.println(s1);  
		System.out.println(s2);  
		System.out.println(s3);  
		System.out.println(name);  
	}
}