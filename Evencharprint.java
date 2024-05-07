package string;
import java.util.Scanner;
public class Evencharprint
{
	public static void main(String[] args)
	{
		String ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		ch=sc.nextLine();
		
		for(int i=0;i<ch.length();i=i+2)
		{
			System.out.println("char at "+i+" place "+ch.charAt(i));
		}
	}
}
