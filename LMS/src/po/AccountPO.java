package po;

import java.util.Vector;

public class AccountPO{
	//BankAccounts has not been handled
	String ID;
	String Title;
	String CreateDate;
	String Operator;
	String BankAccount;
	public AccountPO(String id, String title, String createDate, String operator,String bankaccount) {
		ID = id;
		Title = title;
		CreateDate = createDate;
		Operator = operator;
		BankAccount = bankaccount;
	}
	
	public String getID(){
		return ID;
	}
	public void setID(String id){
		ID = id;
	}
	public String getTitle(){
		return Title;
	}
	public void setTitle(String title){
		Title = title;
	}
	public String getCreateDate(){
		return CreateDate;
	}
	public void setCreateDate(String creatDate){
		CreateDate = creatDate;
	}
	public String getOperator(){
		return Operator;
	}
	public void setOperator(String operator){
		Operator = operator;
	}
	public String getBankAccount(){
		return BankAccount;
	}
	public void setBankAccount(String bankaccount){
		BankAccount = bankaccount;
	}
	
}
