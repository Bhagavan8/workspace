package firstproject;

public class Bankingapplication {
	public static void main(String[] args) {
		
	}

}
class bankaccount
{
	int balance;
	int transactions;
	String customerid;
	String customername;
	
	void deposit(int amount)
	{
		if(amount!=0)
		{
			balance=balance+amount;
			transactions=balance-amount;
			
		}
	}
void withdraw(int amount)
{
	if(amount!=0)
	{
		balance=balance-amount;
		transactions=-amount;
	}
}
void gettransactions()
{
	if(transactions>0)
	{
		System.out.println("deposit:");
		System.out.println("transctions");
	}
		else if(transactions<0)
		{
			System.out.println("withdraw:"+Math.abs(transactions));
		}
	
		else
		{
			System.out.println("no transactions");
		}
		}
void showmenu()
{
	
}
		
	
}


