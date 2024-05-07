package string;
import java.util.*;
public class Atm 
{
	public static void main(String[] args) 
	{
		int ch,balance=10000,amt,pin,cpin=4771,npin,npin1;
		Scanner sc= new Scanner(System.in);
		System.out.println("***********************************");
		System.out.println("*  Welcome to State bank of india *");
		System.out.println("***********************************");
		System.out.println("1 : View Accout Balance");
		System.out.println("2 : Withrow Cash");
		System.out.println("3 : Change PIN");
		System.out.println("0 : logout and Exit");
		System.out.print("Enter your choice :");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("Your account balance is :"+balance);
				break;
			case 2:
				System.out.print("Enter withdrow Amount :");
				amt=sc.nextInt();
				System.out.println("Please wait...");
				System.out.println("Amount withrow susfully...");
				System.out.println("Your account balance is "+((balance)-(amt))+" Rs");
				System.out.println("Thank You for visiting...Have a nice day");
				break;
			case 3:
				do 
				{
				System.out.println("Enter your current PIN :");
				pin=sc.nextInt();
				if(cpin==pin)
				{	
					System.out.println("Please enter new pin :");
					npin=sc.nextInt();
					System.out.println("please re-enter new pin : ");
					npin1=sc.nextInt();
					if(npin==npin1)
					{
						cpin=npin;
						System.out.println("PIN Change sucesfully");
					}
					else
					{
						System.out.println("Please Enter correct pin");
					}
				}
				}while(3>0);
				
		}
	}
}
