
import java.util.Scanner;
public class Account 
{
	double bal;                          //The current balance
	long accnum;                        //The Account number
	String AccHoldersName;             // name of Account holder
	String CNIC;                      //CNIC of Account holder
	static int acc=100;
	Scanner myObj = new Scanner(System.in);
Account(int a)
{
	
	 bal=0;   
	 a=acc;
	 accnum=a;                        
	 acc++;
}
void deposit(double sum)
{
		System.out.println("Enter Money You Want to Deposit");
		sum=myObj.nextDouble();
		bal=bal+sum;
		System.out.println("Balance After Deposit:  "+bal);
}
void withdraw(double sum)
{
		System.out.println("Enter Money You Want to Withdraw");
		sum=myObj.nextDouble();
		if(sum>getbalance())
		{
			System.out.println("Not Enough Balance To Withdraw ");
		}
		else
		{
		bal=bal-sum;
		System.out.println("Balance After Withdraw:  "+bal);
		}
}
double getbalance()
{
	return bal;
}
long getAccountNumber()
{
	return accnum;
}
void DisplayAccount()
{
	System.out.print("Account Number :       "+accnum);
	System.out.print("Balance :              "+bal);
	System.out.print("Account Holder Name :  "+AccHoldersName);
	System.out.println("CNIC :                 "+CNIC);
}
void getData()
{
	System.out.print("Enter Account Holder Name :  ");
	AccHoldersName=myObj.nextLine();
	System.out.print("Enter CNIC :                 ");
	CNIC=myObj.nextLine();
	System.out.print("Enter Balance :              ");
	bal=myObj.nextDouble();
	System.out.println("Your Alloted Account Number is :       "+accnum);
}
}
