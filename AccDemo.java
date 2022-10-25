
import java.util.Scanner;

public class AccDemo 
{
	
	public static void main(String[] args) 
	{
		Account arr[] = new Account[4];
		System.out.println("Enter Account Details");
		for(int i=0;i<4;i++)
		{
		arr[i]=new Account(100);
		arr[i].getData();
		}
		int choice;
		
		do
		   {
			   System.out.println("Enter 1 To Deposit In Account");
			   System.out.println("Enter 2 To Withdraw From Account");
			   System.out.println("Enter 3 To Get Balance of an Account");
			   System.out.println("Enter 4 To Display Account Details");
			   System.out.println("Enter 0 for exit");
			   Scanner myObj = new Scanner(System.in);
			   choice=myObj.nextInt();
			   
			   if(choice==1)
			   {
				   System.out.println("Enter Account Number You Want to Deposit");
					long an=myObj.nextLong();
					boolean found=false;
				   for(int i=0;i<4;i++)
					{
					if(arr[i].getAccountNumber()==an&&found==false)
					{
						arr[i].deposit(100);
						found=true;
					}
					}
					if(found==false)
					{
						System.out.println("Account Does Not Exist");
					}
					
			   }
			   else if(choice==2)
			   {
				   System.out.println("Enter Account Number You Want to Withdraw");
					long an=myObj.nextLong();
					boolean found=false;
				   for(int i=0;i<4;i++)
					{
					if(arr[i].getAccountNumber()==an&&found==false)
					{
						arr[i].withdraw(100);
						found=true;
					}
					}
					if(found==false)
					{
						System.out.println("Account Does Not Exist");
					}
					
			   }
			   else if(choice==3)
			   {
				   System.out.println("Enter Account Number to Know Balance");
					long an=myObj.nextLong();
					boolean found=false;
				   for(int i=0;i<4;i++)
					{
					if(arr[i].getAccountNumber()==an&&found==false)
					{
						System.out.println("Balance in Account Number "+an+" is: "+arr[i].getbalance());
						found=true;
					}
					}
					if(found==false)
					{
						System.out.println("Account Does Not Exist");
					}
					
			   }
			    else if(choice==4)
			   {
			    	for(int i=0;i<4;i++)
					{
						arr[i].DisplayAccount();
						System.out.println();
					}
			   }
			   
			   else if(choice==0)
			   {
			           System.out.println("Thank You For Using Our Program");
			   }
			   else 
			   {
			           System.out.println("Enter The Right Choice");
			   }	   
			   
		   }while(choice!=0);
	}

}
