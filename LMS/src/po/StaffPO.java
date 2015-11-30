package po;

public class StaffPO {
	String ID;
	String NAME;
	String SALARY;
	String INSTITUTION;
	public StaffPO(String id, String name, String salary, String institution) {
		ID = id;
		NAME = name;
		SALARY = salary;
		INSTITUTION = institution;
	}
	public String getID(){
		return ID;
	}
	public String getName(){
		return NAME;
	}
	public String getSalary(){
		return SALARY;
	}
	public String getInsitution(){
		return INSTITUTION;
	}
	public void setID(String s){
		ID = s;
	}
	public void setName(String s){
		NAME = s;
	}
	public void setSalary(String s){
		SALARY = s;
	}
	public void setInstitution(String s){
		INSTITUTION = s;
	}
	
}
