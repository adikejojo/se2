package po;

public class UserPO {
	String Name="null";
	String Position="null";
	String Account = "";
	String PassWord = "";
	
	//����Ĭ����Ա��ź͵�½�˺�һ��
	//���������ݲ��ṩaccount �� password ��set����
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
