package string;
import java.util.Scanner;
public class Emailcheck 
{
	public static void main(String[] args)
	{
		String email;
		char ch;
		int count=0,count1=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Email Id :");
		email=sc.next();
		for(int i=0;i<email.length();i++)
		{
			ch=email.charAt(i);
			if(ch=='@')
			{
				count++;
			}
			else if(ch=='.')
			{
				count1++;
			}
		}
		if(count==1&&count1==2||count1==1)
		{
			System.out.print("Correct Email Id...");
		}
		else
		{
			System.out.println("Incorrect Email Id...");
		}
	}

}
