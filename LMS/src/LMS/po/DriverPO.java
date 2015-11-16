package LMS.po;

public class DriverPO extends ConfigurationPO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String id;
	String name;
	String birthDay;
	String idCardNum;
	String phoneNumber;
	String carUnit;
	String gender;
	String ddl;
	public DriverPO(String id, String name, String birthDay, String idCardNum,
			String phoneNumber, String carUnit, String gender, String ddl) {
		super();
		this.id = id;
		this.name = name;
		this.birthDay = birthDay;
		this.idCardNum = idCardNum;
		this.phoneNumber = phoneNumber;
		this.carUnit = carUnit;
		this.gender = gender;
		this.ddl = ddl;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public String getIdCardNum() {
		return idCardNum;
	}
	public void setIdCardNum(String idCardNum) {
		this.idCardNum = idCardNum;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCarUnit() {
		return carUnit;
	}
	public void setCarUnit(String carUnit) {
		this.carUnit = carUnit;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDdl() {
		return ddl;
	}
	public void setDdl(String ddl) {
		this.ddl = ddl;
	}
}
