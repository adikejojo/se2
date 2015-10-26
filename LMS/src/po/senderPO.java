package po;

import java.io.Serializable;

public class senderPO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	String address;
	String unit;
	String phoneNumber;
	
	public senderPO(String name, String address, String phoneNumber) {
		super();
		this.name = name;
		this.address = address;
//		this.unit = unit;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getUnit() {
		return unit;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	
}
