package po;

public class UserPO {
	String Name="null";
	String Position="null";
	String Account = "";
	String PassWord = "";
	
	//这里默认人员编号和登陆账号一致
	//根据需求，暂不提供account 和 password 的set方法
	public UserPO(String name,String position, String account, String password){
		Name = name;
		Position = position;
		Account = account;
		PassWord = password;
	}
	public UserPO(String account, String password){
		Account = account;
		PassWord = password;
	};
	public String getName(){
		return Name;
	}
	public String getPosition(){
		return Position;
	}
	public String getAccount(){
		return Account;
	}
	public String getPassword(){
		return PassWord;
	}
	
	public void setName(String name){
		Name = name;
	}
	public void setPosition(String position){
		Position = position;
	}
}
