package po;

public class BankAccountPO {
	String AccountTitle;
	String AccountNumber;
	String Amount;
	public BankAccountPO(String accounttitle, String accountnumber, String amount) {
		AccountNumber = accountnumber;
		AccountTitle = accounttitle;
		Amount = amount;
	}
	public String getAccountTitle(){
		return AccountTitle;
	}
	public String getAccountNumber(){
		return AccountNumber;
	}
	public String getAmount(){
		return Amount;
	}
	void setAccountTitle(String title){
		AccountTitle = title;
	}
	void setAccountNumber(String number){
		AccountNumber = number;
	}
	void setAmount(String amount){
		Amount = amount;
	}
}
