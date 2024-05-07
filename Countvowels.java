package string;
import java.util.Scanner;
public class Countvowels 
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
			if(a=='a'||a=='A'||a=='e'||a=='E'||a=='i'||a=='I'||a=='o'||a=='O'||a=='u'||a=='U')
			{
				count++;
			}
		}
			System.out.println(" no of vowels = "+count);

	}

}
