
import java.util.ArrayList;
public class atm {
	private ArrayList<bankAccount> bankAccounts;
	
	public void deposit (String bankID, int money) {
		if (money > 0) {
			boolean deposited = false;
			for(int i =0; i< bankAccounts.size(); i++) {
				if(bankAccounts.get(i).getID().equals(bankID)) {
					bankAccounts.get(i).changeMoney(money);
					deposited = true;
				}
			}
			if (!deposited) {
				bankAccount newAccount = bankAccount(bankID);
				bankAccounts.add(newAccount);
			}
		}
	}

}
