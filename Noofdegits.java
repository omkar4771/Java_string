package string;
import java.util.Scanner;
public class Noofdegits 
{
	public static void main(String[] args) 
	{
		String ch;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		ch=sc.nextLine();
		for(int i=0;i<ch.length();i++)
		{
			char a=ch.charAt(i);
			if(a>='0'&&a<='9')
			{
				count++;
			}
		}
		System.out.println("No of digits : "+count);
	}

}
