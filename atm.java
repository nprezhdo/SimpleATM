import java.util.*;
import java.util.ArrayList;
public class atm
{
	private ArrayList<bankAccount> bankAccounts; //Array of bank account class

	class bankAccount  //bank account class
	{
	 private String bankID;
	 private double money;
	 public bankAccount(String id, double depos) //bank account constructor
	 {
		 money = depos;
		 bankID = id;
	 }
	 public void changeMoney(double amount)
	 {
		 money = money + amount;
	 }
	 public String getID()
	 {
		 return bankID;
	 }
 }

	public atm() //atm constructor
	{
		bankAccounts = new ArrayList<bankAccount>();
	}


public void deposit(String bankID, double money) //deposit method
{
	boolean exist = false; //account existence variable

	if(money<0)
	{
		throw new IllegalArgumentException("");
	}
	if(bankAccounts.size() == 0)
	{
		bankAccounts.add(new bankAccount(bankID, money));
		return;

	}
	for(int i = 0; i < bankAccounts.size(); i++)
	{
		if(bankAccounts.get(i).bankID == bankID)
		{
			exist = true;
			bankAccounts.get(i).changeMoney(money);
		}
	}
	if(exist == false)
		{
			bankAccounts.add(new bankAccount(bankID, money));
		}


}

public double checkBalance(String id) //check balance method
{
	for (int i = 0; i < bankAccounts.size(); i++)
	{
		if(bankAccounts.get(i).bankID == id)
		{
			return bankAccounts.get(i).money;
		}
	}
	return 0;
}

public void withdraw(String id, double withdraw) //withdraw method
{
	for (int i = 0; i < bankAccounts.size(); i++)
	{
		if(bankAccounts.get(i).bankID == id)
		{
			if(bankAccounts.get(i).money < withdraw)
			{
				withdraw = bankAccounts.get(i).money;
			}
			if(withdraw > 0)
			{
			bankAccounts.get(i).changeMoney((-1*withdraw));
		}
		else
		{
			bankAccounts.get(i).changeMoney((-withdraw));
		}
		}
	}
}
}
