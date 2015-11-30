package po;

public class InstitutionPO {
	String ID;
	String NAME;
	String STAFF;
	public InstitutionPO(String id, String name, String staff) {
		ID = id;
		NAME = name;
		STAFF = staff;
	}
	public String getID(){
		return ID;
	}
	public String getName(){
		return NAME;
	}
	public String getStaff(){
		return STAFF;
	}
	public void setStaff(String staff){
		STAFF = staff;
	}
	public void setName(String name){
		NAME = name ;
	}
	public void setID(String id){
		ID = id;
	}
}
