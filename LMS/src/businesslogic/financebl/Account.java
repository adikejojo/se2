package businesslogic.financebl;
import businesslogicservice.financeblservice.AccountService;

public class Account implements AccountService{
	public Account initialization(){
		Account newAccount = new Account();
		return newAccount;
	}
	
	public String[] getAccount(String id){
		String accountInfo[] = new String[2];
		String name = new String();
		String accountNum = new String();
		name = getName(id);
		accountNum = getAccoNum(id);
		accountInfo[0] = name;
		accountInfo[1] = accountNum;
		return accountInfo;
	}
	
	public String getName(String id){
		return "ÄÇ¸öË­";
	}
	
	public String getAccoNum(String id){
		return "1234567890";
	}
}
