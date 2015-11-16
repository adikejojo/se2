package businesslogicservice.financeblservice;

import businesslogic.financebl.Account;

public interface AccountService {
	public Account initialization();
	
	public String[] getAccount(String id);
	
	public String getName(String id);
	
	public String getAccoNum(String id);
}
