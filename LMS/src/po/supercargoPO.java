package po;

public class supercargoPO extends ConfigurationPO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String id;
	String name;
	String birth_date;
	String ID_Number;
	String phone_number;
	int gender;
	
	public supercargoPO(String name, String birth_date, String iD_Number,
			String phone_number, int gender) {
		super();
		this.name = name;
		this.birth_date = birth_date;
		ID_Number = iD_Number;
		this.phone_number = phone_number;
		this.gender = gender;
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getBirth_date() {
		return birth_date;
	}
	public String getID_Number() {
		return ID_Number;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public int getGender() {
		return gender;
	}

}
