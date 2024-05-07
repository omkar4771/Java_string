package string;
import java.util.Scanner;
public class Charpossion 
{
	public static void main(String[] args) 
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the char ...");
		str=sc.next();
		
		for (int i=0; i<str.length(); i++) 
		{
			System.out.println("Char at "+i+" place "+str.charAt(i));
		}
	}

}
