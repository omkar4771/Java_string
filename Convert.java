package string;
import java.util.Scanner;
public class Convert
{
	public static void main(String[] args) 
	{
		String str;
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String..");
		str=sc.nextLine();
		
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				ch=(char)(ch+32);
				System.out.print(""+ch);
			}
			else if(ch>='a'&&ch<='z')
			{
				ch=(char)(ch-32);
				System.out.print(""+ch);
			}
		}
	}
}
