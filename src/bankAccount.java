
// its just a bank account with an amount of money
public class bankAccount {
	private String bankID;
	private int money;
	public bankAccount(String id) {
		money = 0;
		bankID = id;
	}
	public void changeMoney(int amount) {
		money = money + amount;
	}
	public String getID() {
		return bankID;
	}

}
