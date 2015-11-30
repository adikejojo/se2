package po;

public class DriverPO {

	int DriverNumber;
	String name;
	String birthDate;
	String IDnumber;
	String phoneNumber;
	String vehicleUnit;
	String gender;
	String validTime;

	public DriverPO(int driverNumber, String name, String birthDate,
			String iDnumber, String phoneNumber, String vehicleUnit,
			String gender, String validTime) {
		super();
		DriverNumber = driverNumber;
		this.name = name;
		this.birthDate = birthDate;
		IDnumber = iDnumber;
		this.phoneNumber = phoneNumber;
		this.vehicleUnit = vehicleUnit;
		this.gender = gender;
		this.validTime = validTime;
	}

	public int getDriverNumber() {
		return DriverNumber;
	}

	public String getName() {
		return name;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public String getIDnumber() {
		return IDnumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getVehicleUnit() {
		return vehicleUnit;
	}

	public String getGender() {
		return gender;
	}

	public String getValidTime() {
		return validTime;
	}

}
